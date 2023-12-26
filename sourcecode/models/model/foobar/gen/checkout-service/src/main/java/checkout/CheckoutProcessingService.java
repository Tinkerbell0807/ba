package checkout;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import checkout.CheckoutBackofficeService;


@Service
public class CheckoutProcessingService {

    Logger logger = LoggerFactory.getLogger(CheckoutProcessingService.class);
	private final CheckoutBackofficeService checkoutBackofficeService;

	CheckoutProcessingService(CheckoutBackofficeService checkoutBackofficeService){
		this.checkoutBackofficeService = checkoutBackofficeService;
	}

	public void checkoutOrder(){
		logger.info("checkoutOrder executed");
		//TODO: Implement Behaviour
		throw new RuntimeException("NotYetImplemented");
	}
	public void createInvoice(){
		logger.info("createInvoice executed");
		//TODO: Implement Behaviour
		throw new RuntimeException("NotYetImplemented");
	}

}
