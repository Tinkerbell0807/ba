package kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import marketing.NotificationService;

@Service
public class NotificationProducer {

    Logger logger = LoggerFactory.getLogger(NotificationProducer.class);
	private final NotificationService notificationService;
	private final KafkaTemplate<String, String> kafkaTemplate;

	NotificationProducer(NotificationService notificationService, KafkaTemplate<String,String> kafkaTemplate){
	this.notificationService = notificationService;
	this.kafkaTemplate = kafkaTemplate;
	}

    public void sendMessage(String topic, String message) {
        kafkaTemplate.send(topic, message);
    }
}
