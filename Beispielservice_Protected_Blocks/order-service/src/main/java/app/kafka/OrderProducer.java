package app.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class OrderProducer {

    private static final Logger logger = LoggerFactory.getLogger(OrderProducer.class);
    private static final String TOPIC_NAME = "order";
    private final KafkaTemplate<String, String> kafkaTemplate;


    OrderProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        kafkaTemplate.send(TOPIC_NAME, message);
        logger.info("Message sent to topic {}: {}", TOPIC_NAME, message);
    }
}
