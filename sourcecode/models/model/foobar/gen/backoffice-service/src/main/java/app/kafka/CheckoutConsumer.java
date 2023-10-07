package app.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class CheckoutConsumer {

    Logger logger = LoggerFactory.getLogger(CheckoutConsumer.class);

	CheckoutConsumer(){
	}

    @KafkaListener(topics = "checkout",groupId = "backoffice-service-checkout-consumer")
    public void listen(String message) {
		logger.info("Received message from {}: {}","checkout", message);
    }
}
