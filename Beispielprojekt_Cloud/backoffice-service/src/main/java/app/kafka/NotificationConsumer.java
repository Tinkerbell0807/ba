package app.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationConsumer {

    Logger logger = LoggerFactory.getLogger(NotificationConsumer.class);

    NotificationConsumer() {}

    @KafkaListener(topics = "notification", groupId = "backoffice-service-notification-consumer")
    public void listen(String message) {
        logger.info("Received message from {}: {}", "notification", message);
    }
}
