package app.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CheckoutInformationProducer {

    Logger logger = LoggerFactory.getLogger(CheckoutInformationProducer.class);
	private final KafkaTemplate<String, String> kafkaTemplate;

	CheckoutInformationProducer(KafkaTemplate<String,String> kafkaTemplate){
		this.kafkaTemplate = kafkaTemplate;
	}

    public void sendMessage(String topic, String message) {
        kafkaTemplate.send(topic, message);
    }
}
