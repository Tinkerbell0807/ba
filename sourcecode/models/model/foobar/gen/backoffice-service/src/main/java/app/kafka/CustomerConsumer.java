package app.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class CustomerConsumer {

    Logger logger = LoggerFactory.getLogger(CustomerConsumer.class);

	CustomerConsumer(){
	}

    @KafkaListener(topics = "customer",groupId = "backoffice-service-customer-consumer")
    public void listen(String message) {
		logger.info("Received message from {}: {}","customer", message);
    }
}
