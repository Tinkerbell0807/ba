package kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import notification.NotificationRepository;

@Service
public class NotificationConsumer {

    Logger logger = LoggerFactory.getLogger(NotificationConsumer.class);
	private final NotificationRepository notificationRepository;

	NotificationConsumer(NotificationRepository notificationRepository){
	this.notificationRepository = notificationRepository;
	}

    @KafkaListener(topics = "default-topic-name", groupId = "groupId")
    public void listen(String message) {
        System.out.println("Received message in group yourGroupId: " + message);
    }
	
	private void interfaceForNotificationRepository(){
		//TODO: Implement
	}
}
