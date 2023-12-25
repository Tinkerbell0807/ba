package kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import checkout.CheckoutBackofficeService;

@Service
public class CheckoutInformationProducer {

    Logger logger = LoggerFactory.getLogger(CheckoutInformationProducer.class);
	private final CheckoutBackofficeService checkoutBackofficeService;
	private final KafkaTemplate<String, String> kafkaTemplate;

	CheckoutInformationProducer(CheckoutBackofficeService checkoutBackofficeService, KafkaTemplate<String,String> kafkaTemplate){
	this.checkoutBackofficeService = checkoutBackofficeService;
	this.kafkaTemplate = kafkaTemplate;
	}

    public void sendMessage(String topic, String message) {
        kafkaTemplate.send(topic, message);
    }
}
