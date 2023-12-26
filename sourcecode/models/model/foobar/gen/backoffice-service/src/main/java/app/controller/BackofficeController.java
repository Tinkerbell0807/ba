package app.controller;

import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import app.backoffice.DataSearchService;

@RestController
public class BackofficeController {

    Logger logger = LoggerFactory.getLogger(BackofficeController.class);
	private final DataSearchService dataSearchService;

	BackofficeController(DataSearchService dataSearchService){
	this.dataSearchService = dataSearchService;
	}

    @GetMapping("/getNotification")
    public String getNotification() {
		logger.info("getNotification executed");
        // TODO: Implement Endpoint
        return "200 OK from getNotification";
    }
    @GetMapping("/getOrder")
    public String getOrder() {
		logger.info("getOrder executed");
        // TODO: Implement Endpoint
        return "200 OK from getOrder";
    }
    @GetMapping("/getCheckout")
    public String getCheckout() {
		logger.info("getCheckout executed");
        // TODO: Implement Endpoint
        return "200 OK from getCheckout";
    }
    @GetMapping("/getCustomer")
    public String getCustomer() {
		logger.info("getCustomer executed");
        // TODO: Implement Endpoint
        return "200 OK from getCustomer";
    }
}
