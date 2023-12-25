package checkout;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CheckoutBackofficeService {

    Logger logger = LoggerFactory.getLogger(CheckoutBackofficeService.class);

	CheckoutBackofficeService(){
	}

	public void publishCheckoutInformation(){
		logger.info("publishCheckoutInformation executed");
		//TODO: Implement Behaviour
		throw new RuntimeException("NotYetImplemented");
	}
}

