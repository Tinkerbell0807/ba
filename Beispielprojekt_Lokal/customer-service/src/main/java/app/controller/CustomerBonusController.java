package app.controller;

import app.customer.CustomerBonusService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerBonusController {

    private final CustomerBonusService customerBonusService;
    Logger logger = LoggerFactory.getLogger(CustomerBonusController.class);

    CustomerBonusController(CustomerBonusService customerBonusService) {
        this.customerBonusService = customerBonusService;
    }

    @GetMapping("/getCustomerBonusInformation")
    public String getCustomerBonusInformation() {
        logger.info("getCustomerBonusInformation executed");
        // TODO: Implement Endpoint
        return "200 OK from getCustomerBonusInformation";
    }
}
