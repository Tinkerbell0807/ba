package app.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import app.customer.CustomerRepository;

@Service
public class CustomerConsumer {

    private final CustomerRepository customerRepository;
    Logger logger = LoggerFactory.getLogger(CustomerConsumer.class);

    CustomerConsumer(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @KafkaListener(topics = "customer", groupId = "backoffice-service-customer-consumer")
    public void listen(String message) {
        logger.info("Received message from {}: {}", "customer", message);
    }

    private void referencedElementsCustomerRepository() {
        //TODO: Implement
    }
}
