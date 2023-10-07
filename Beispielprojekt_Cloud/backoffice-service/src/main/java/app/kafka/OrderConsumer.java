package app.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {

    Logger logger = LoggerFactory.getLogger(OrderConsumer.class);

    OrderConsumer() {}

    @KafkaListener(topics = "order", groupId = "backoffice-service-order-consumer")
    public void listen(String message) {
        logger.info("Received message from {}: {}", "order", message);
    }
}
