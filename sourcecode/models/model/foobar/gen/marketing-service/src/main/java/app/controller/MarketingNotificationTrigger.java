package app.controller;

import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import app.marketing.NotificationService;

@RestController
public class MarketingNotificationTrigger {

    Logger logger = LoggerFactory.getLogger(MarketingNotificationTrigger.class);
	private final NotificationService notificationService;

	MarketingNotificationTrigger(NotificationService notificationService){
	this.notificationService = notificationService;
	}

    @PostMapping("/triggerNotificationForCustomer")
    public String triggerNotificationForCustomer() {
		logger.info("triggerNotificationForCustomer executed");
        // TODO: Implement Endpoint
        return "200 OK from triggerNotificationForCustomer";
    }
}
