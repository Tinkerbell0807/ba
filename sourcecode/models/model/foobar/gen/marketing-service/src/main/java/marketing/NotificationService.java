package marketing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    Logger logger = LoggerFactory.getLogger(NotificationService.class);
	private final MarketingNotification marketingNotification;

	NotificationService(MarketingNotification marketingNotification){
		this.marketingNotification = marketingNotification;
	}

	public void generateGiftCode(){
		logger.info("generateGiftCode executed");
		//TODO: Implement Behaviour
		throw new RuntimeException("NotYetImplemented");
	}
}

