package app.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import app.customer.CustomerRepository;
import app.order.OrderRepository;
import app.order.OrderFactory;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;import app.kafka.OrderProducer;


@Service
public class OrderProcessService {

    Logger logger = LoggerFactory.getLogger(OrderProcessService.class);
	private final CustomerRepository customerRepository;
	private final OrderRepository orderRepository;
	private final OrderFactory orderFactory;
	private final OrderProducer orderProducer;
    private final WebClient webClient;

OrderProcessService
(
CustomerRepository customerRepository
,OrderRepository orderRepository
,OrderFactory orderFactory
,OrderProducer orderProducer
,WebClient webClient
)
{
		this.customerRepository = customerRepository;
		this.orderRepository = orderRepository;
		this.orderFactory = orderFactory;
		this.orderProducer = orderProducer;
    	this.webClient = webClient;
}


    private Mono<String> requestProcessCheckout() {
		logger.info("requestProcessCheckout executed");
        return webClient.post()
                .uri("microservice-domain.org/processCheckout")
                .retrieve()
                .bodyToMono(String.class);
    }
}
