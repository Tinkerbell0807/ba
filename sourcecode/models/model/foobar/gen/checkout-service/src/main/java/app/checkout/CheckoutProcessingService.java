package app.checkout;

// Start of user code Imports

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;



import app.kafka.CheckoutInformationProducer;

// End of user code

@Service
public class CheckoutProcessingService {

// Start of user code Members

    Logger logger = LoggerFactory.getLogger(CheckoutProcessingService.class);


	private final CheckoutInformationProducer checkoutInformationProducer;


// End of user code

// Start of user code Constructor
	CheckoutProcessingService(

		CheckoutInformationProducer checkoutInformationProducer

)



{

		this.checkoutInformationProducer = checkoutInformationProducer;

// End of user code

// Start of user code checkoutOrder
	public void checkoutOrder(){
		logger.info("checkoutOrder executed");
		//TODO: Implement Behaviour
	}
// End of user code

// Start of user code createCheckoutInformation
	public void createCheckoutInformation(){
		logger.info("createCheckoutInformation executed");
		//TODO: Implement Behaviour
	}
// End of user code



// Start of user code additional protected methods
// End of user code
}
