package app.controller;

import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import app.customer.CustomerBonusService;

@RestController
public class CustomerBonusController {

    Logger logger = LoggerFactory.getLogger(CustomerBonusController.class);
	private final CustomerBonusService customerBonusService;

	CustomerBonusController(CustomerBonusService customerBonusService){
	this.customerBonusService = customerBonusService;
	}

    @GetMapping("/getCustomerBonusInformation")
    public String getCustomerBonusInformation() {
		logger.info("getCustomerBonusInformation executed");
        // TODO: Implement Endpoint
        return "200 OK from getCustomerBonusInformation";
    }
}
