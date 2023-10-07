package app.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CheckoutInformationProducer {

    private static final Logger logger = LoggerFactory.getLogger(CheckoutInformationProducer.class);
    private static final String TOPIC_NAME = "checkout";
	private final KafkaTemplate<String, String> kafkaTemplate;


	CheckoutInformationProducer(KafkaTemplate<String,String> kafkaTemplate){
		this.kafkaTemplate = kafkaTemplate;
	}

    public void sendMessage(String message) {
        kafkaTemplate.send(TOPIC_NAME, message);
        logger.info("Message sent to topic {}: {}", TOPIC_NAME, message);
    }
}
