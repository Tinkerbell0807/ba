package customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CustomerBonusService {

    Logger logger = LoggerFactory.getLogger(CustomerBonusService.class);
	private final CustomerMarketingObject customerMarketingObject;

	CustomerBonusService(CustomerMarketingObject customerMarketingObject){
		this.customerMarketingObject = customerMarketingObject;
	}

	public void addBonusPointsToCustomer(){
		logger.info("addBonusPointsToCustomer executed");
		//TODO: Implement Behaviour
		throw new RuntimeException("NotYetImplemented");
	}
	public void triggerMarketing(){
		logger.info("triggerMarketing executed");
		//TODO: Implement Behaviour
		throw new RuntimeException("NotYetImplemented");
	}
}

