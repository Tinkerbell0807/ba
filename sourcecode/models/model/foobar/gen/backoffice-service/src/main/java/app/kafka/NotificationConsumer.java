package app.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import app.notification.NotificationRepository;

@Service
public class NotificationConsumer {

    Logger logger = LoggerFactory.getLogger(NotificationConsumer.class);
	private final NotificationRepository notificationRepository;

	NotificationConsumer(NotificationRepository notificationRepository){
	this.notificationRepository = notificationRepository;
	}

    @KafkaListener(topics = "notification",groupId = "backoffice-service-notification-consumer")
    public void listen(String message) {
		logger.info("Received message from {}: {}","notification", message);
    }
}
