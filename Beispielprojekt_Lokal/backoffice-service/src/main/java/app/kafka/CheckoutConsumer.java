package app.kafka;

import app.checkout.CheckoutRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class CheckoutConsumer {

    private final CheckoutRepository checkoutRepository;
    Logger logger = LoggerFactory.getLogger(CheckoutConsumer.class);

    CheckoutConsumer(CheckoutRepository checkoutRepository) {
        this.checkoutRepository = checkoutRepository;
    }

    @KafkaListener(topics = "checkout", groupId = "backoffice-service-checkout-consumer")
    public void listen(String message) {
        logger.info("Received message from {}: {}", "checkout", message);
    }

    private void referencedElementsCheckoutRepository() {
        //TODO: Implement
    }
}
