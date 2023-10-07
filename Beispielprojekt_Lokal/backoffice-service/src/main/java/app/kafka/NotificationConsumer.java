package app.kafka;

import app.notification.NotificationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationConsumer {

    private final NotificationRepository notificationRepository;
    Logger logger = LoggerFactory.getLogger(NotificationConsumer.class);

    NotificationConsumer(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    @KafkaListener(topics = "notification", groupId = "backoffice-service-notification-consumer")
    public void listen(String message) {
        logger.info("Received message from {}: {}", "notification", message);
    }

    private void referencedElementsNotificationRepository() {
        //TODO: Implement
    }
}
