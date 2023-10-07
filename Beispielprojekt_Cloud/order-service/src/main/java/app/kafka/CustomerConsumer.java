package app.kafka;

import app.customer.CustomerFactory;
import app.customer.CustomerRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class CustomerConsumer {

    private final CustomerRepository customerRepository;
    private final CustomerFactory customerFactory;
    Logger logger = LoggerFactory.getLogger(CustomerConsumer.class);

    CustomerConsumer(CustomerRepository customerRepository, CustomerFactory customerFactory) {
        this.customerRepository = customerRepository;
        this.customerFactory = customerFactory;
    }

    @KafkaListener(topics = "customer", groupId = "order-service-customer-consumer")
    public void listen(String message) {
        logger.info("Received message from {}: {}", "customer", message);
        try {
            var customerEntity = customerFactory.createCustomerEntity(message);
            customerRepository.save(customerEntity);
        } catch (JsonProcessingException e) {
            logger.error("Message could not be processed: [{}]", message);
        }

    }
}
