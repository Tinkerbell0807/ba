package controller;

import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class CustomerRewardController {
    Logger logger = LoggerFactory.getLogger(CustomerRewardController.class);  
    @PostMapping("/postCustomerRewardObject")
    public String postCustomerRewardObject() {
		logger.info("postCustomerRewardObject executed");
        // TODO: not yet implemented
        return "200 OK from postCustomerRewardObject";
    }
}
