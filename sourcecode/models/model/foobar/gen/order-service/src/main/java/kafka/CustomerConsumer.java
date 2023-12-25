package kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import customer.CustomerRepository;

@Service
public class CustomerConsumer {

    Logger logger = LoggerFactory.getLogger(CustomerConsumer.class);
	private final CustomerRepository customerRepository;

	CustomerConsumer(CustomerRepository customerRepository){
	this.customerRepository = customerRepository;
	}

    @KafkaListener(topics = "invalid", groupId = "groupId")
    public void listen(String message) {
        System.out.println("Received message in group yourGroupId: " + message);
    }
	
	private void interfaceForCustomerRepository(){
		//TODO: Implement
	}
}
