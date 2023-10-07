package app.order;

import app.customer.CustomerRepository;
import app.kafka.OrderProducer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Random;
import java.util.UUID;

@Service
public class OrderProcessService {

    private final ObjectMapper objectMapper;
    private final CustomerRepository customerRepository;
    private final OrderRepository orderRepository;
    private final OrderFactory orderFactory;
    private final OrderProducer orderProducer;
    private final WebClient webClient;
    Logger logger = LoggerFactory.getLogger(OrderProcessService.class);
    @Value("${external-services.checkout-service.base-url}")
    private String checkoutBaseUrl;


    OrderProcessService(ObjectMapper objectMapper, CustomerRepository customerRepository, OrderRepository orderRepository, OrderFactory orderFactory, OrderProducer orderProducer, WebClient webClient) {
        this.objectMapper = objectMapper;
        this.customerRepository = customerRepository;
        this.orderRepository = orderRepository;
        this.orderFactory = orderFactory;
        this.orderProducer = orderProducer;
        this.webClient = webClient;
    }

    @Scheduled(cron = "*/20 * * * * *")
    private void createOrder() {
        logger.info("Starting the process to create a new order");
        var customers = customerRepository.findByOrderCountLessThan(2);
        if (customers.isEmpty()) {
            logger.info("No customers found with order count less than 2");
            return;
        }
        Random random = new Random();
        var customer = customers.get(random.nextInt(customers.size()));
        logger.info("Processing checkout for customer with UUID: [{}]", customer.getCustomerUuid());
        requestProcessCheckout(customer.getCustomerUuid());
        customer.setOrderCount(customer.getOrderCount() + 1);
        customerRepository.saveAndFlush(customer);
        logger.info("Updated order count for customer with UUID: [{}]", customer.getCustomerUuid());
    }

    private void requestProcessCheckout(UUID customerUuid) {
        var orderEntity = orderFactory.createOrderEntity(customerUuid);
        logger.info("Sending request to process checkout for OrderEntity with ID: [{}]", orderEntity.getOrderUuid());
        webClient.post()
                .uri(checkoutBaseUrl + "/processCheckout")
                .bodyValue(orderEntity.getOrderUuid())
                .retrieve()
                .onStatus(HttpStatus.INTERNAL_SERVER_ERROR::equals, clientResponse -> Mono.error(new RuntimeException("Server Error: " + clientResponse.statusCode())))
                .bodyToMono(String.class)
                .subscribe(
                        this::handleResponse,
                        error -> handleError(error, orderEntity),
                        () -> completeProcessing(orderEntity)
                );
    }

    private void handleResponse(String response) {
        logger.info("Response received from checkout service: [{}]", response);
    }

    private void handleError(Throwable error, OrderEntity orderEntity) {
        logger.error("Error during the webClient call for OrderEntity with ID: [{}]", orderEntity.getOrderUuid(), error);
    }

    private void completeProcessing(OrderEntity orderEntity) {
        try {
            logger.info("Saving OrderEntity with ID: [{}]", orderEntity.getOrderUuid());
            orderRepository.save(orderEntity);
            String json = objectMapper.writeValueAsString(orderEntity);
            orderProducer.sendMessage(json);
            logger.info("OrderEntity with ID: [{}] saved and message sent", orderEntity.getOrderUuid());
        } catch (JsonProcessingException e) {
            logger.error("Error converting OrderEntity with ID: [{}] to JSON", orderEntity.getOrderUuid(), e);
        } catch (Exception ex) {
            logger.error("Error in processing OrderEntity with ID: [{}]", orderEntity.getOrderUuid(), ex);
        }
    }
}

