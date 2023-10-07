package app.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import app.customer.CustomerRepository;
import app.customer.CustomerFactory;

@Service
public class CustomerConsumer {

    Logger logger = LoggerFactory.getLogger(CustomerConsumer.class);
	private final CustomerRepository customerRepository;
	private final CustomerFactory customerFactory;

	CustomerConsumer(CustomerRepository customerRepository,CustomerFactory customerFactory){
	this.customerRepository = customerRepository;
	this.customerFactory = customerFactory;
	}

    @KafkaListener(topics = "customer",groupId = "order-service-customer-consumer")
    public void listen(String message) {
		logger.info("Received message from {}: {}","customer", message);
    }
}
