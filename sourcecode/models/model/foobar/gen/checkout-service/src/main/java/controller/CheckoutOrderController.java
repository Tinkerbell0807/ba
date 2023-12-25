package controller;

import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class CheckoutOrderController {
    Logger logger = LoggerFactory.getLogger(CheckoutOrderController.class);  
    @PostMapping("/checkoutOrder")
    public String checkoutOrder() {
		logger.info("checkoutOrder executed");
        // TODO: not yet implemented
        return "200 OK from checkoutOrder";
    }
}
