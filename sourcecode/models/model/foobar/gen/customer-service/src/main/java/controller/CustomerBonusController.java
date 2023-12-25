package controller;

import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import customer.CustomerBonusService;
import customer.CustomerFactory;

@RestController
public class CustomerBonusController {

    Logger logger = LoggerFactory.getLogger(CustomerBonusController.class);
	private final CustomerBonusService customerBonusService;
	private final CustomerFactory customerFactory;

	CustomerBonusController(CustomerBonusService customerBonusService,CustomerFactory customerFactory){
	this.customerBonusService = customerBonusService;
	this.customerFactory = customerFactory;
	}

    @GetMapping("/getCustomerBonusInformation")
    public String getCustomerBonusInformation() {
		logger.info("getCustomerBonusInformation executed");
        // TODO: not yet implemented
        return "200 OK from getCustomerBonusInformation";
    }
}
