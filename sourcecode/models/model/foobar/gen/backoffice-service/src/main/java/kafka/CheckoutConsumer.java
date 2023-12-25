package kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import checkout.CheckoutRepository;

@Service
public class CheckoutConsumer {

    Logger logger = LoggerFactory.getLogger(CheckoutConsumer.class);
	private final CheckoutRepository checkoutRepository;

	CheckoutConsumer(CheckoutRepository checkoutRepository){
	this.checkoutRepository = checkoutRepository;
	}

    @KafkaListener(topics = "default-topic-name", groupId = "groupId")
    public void listen(String message) {
        System.out.println("Received message in group yourGroupId: " + message);
    }
	
	private void interfaceForCheckoutRepository(){
		//TODO: Implement
	}
}
