package kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import order.OrderProcessService;

@Service
public class OrderProducer {

    Logger logger = LoggerFactory.getLogger(OrderProducer.class);
	private final OrderProcessService orderProcessService;
	private final KafkaTemplate<String, String> kafkaTemplate;

	OrderProducer(OrderProcessService orderProcessService, KafkaTemplate<String,String> kafkaTemplate){
	this.orderProcessService = orderProcessService;
	this.kafkaTemplate = kafkaTemplate;
	}

    public void sendMessage(String topic, String message) {
        kafkaTemplate.send(topic, message);
    }
}
