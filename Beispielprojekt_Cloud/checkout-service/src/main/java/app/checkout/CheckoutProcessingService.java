package app.checkout;

import app.kafka.CheckoutInformationProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


import java.time.LocalDateTime;
import java.util.Random;

@Service
public class CheckoutProcessingService {

    private final CheckoutInformationProducer checkoutInformationProducer;
    private final Random random = new Random();
    Logger logger = LoggerFactory.getLogger(CheckoutProcessingService.class);

    CheckoutProcessingService(CheckoutInformationProducer checkoutInformationProducer) {
        this.checkoutInformationProducer = checkoutInformationProducer;
    }

    public boolean checkoutOrder() {
        return random.nextInt(100) < 95;
    }

    public void createCheckoutInformation(String orderUuid) {
        String message = String.format("{orderUuid: \"%s\", validationTimestamp: \"%s\"}", orderUuid, LocalDateTime.now());
        checkoutInformationProducer.sendMessage(message);
    }
}