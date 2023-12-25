package kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import customer.CustomerRegistrationService;

@Service
public class CustomerProducer {

    Logger logger = LoggerFactory.getLogger(CustomerProducer.class);
	private final CustomerRegistrationService customerRegistrationService;
	private final KafkaTemplate<String, String> kafkaTemplate;

	CustomerProducer(CustomerRegistrationService customerRegistrationService, KafkaTemplate<String,String> kafkaTemplate){
	this.customerRegistrationService = customerRegistrationService;
	this.kafkaTemplate = kafkaTemplate;
	}

    public void sendMessage(String topic, String message) {
        kafkaTemplate.send(topic, message);
    }
}
