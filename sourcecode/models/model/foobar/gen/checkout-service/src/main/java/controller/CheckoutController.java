package controller;

import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import checkout.CheckoutProcessingService;

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
        // TODO: not yet implemented
        return "200 OK from processCheckout";
    }
}
