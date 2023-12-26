package app.controller;

import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import app.checkout.CheckoutProcessingService;

@RestController
public class CheckoutController {

    Logger logger = LoggerFactory.getLogger(CheckoutController.class);
	private final CheckoutProcessingService checkoutProcessingService;

	CheckoutController(CheckoutProcessingService checkoutProcessingService){
	this.checkoutProcessingService = checkoutProcessingService;
	}

    @PostMapping("/processCheckout")
    public String processCheckout() {
		logger.info("processCheckout executed");
        // TODO: Implement Endpoint
        return "200 OK from processCheckout";
    }
}
