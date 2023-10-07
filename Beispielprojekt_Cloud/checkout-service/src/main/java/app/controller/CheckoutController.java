package app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import app.checkout.CheckoutProcessingService;

@RestController
public class CheckoutController {

    Logger logger = LoggerFactory.getLogger(CheckoutController.class);
    private final CheckoutProcessingService checkoutProcessingService;

    CheckoutController(CheckoutProcessingService checkoutProcessingService) {
        this.checkoutProcessingService = checkoutProcessingService;
    }

    @PostMapping("/processCheckout")
    public ResponseEntity<String> processCheckout(@RequestBody String orderUuid) {
        logger.info("processCheckout executed with orderUuid: {}", orderUuid);
        boolean isSuccessful = checkoutProcessingService.checkoutOrder();
        if (isSuccessful) {
            checkoutProcessingService.createCheckoutInformation(orderUuid);
            logger.info("Order validated with orderUuid: {}", orderUuid);
            return ResponseEntity.ok("Checkout processed successfully.");
        } else {
            logger.warn("Order could not be validated with orderUuid: {}", orderUuid);
            return ResponseEntity.status(500).body("Checkout processing failed.");
        }
    }
}