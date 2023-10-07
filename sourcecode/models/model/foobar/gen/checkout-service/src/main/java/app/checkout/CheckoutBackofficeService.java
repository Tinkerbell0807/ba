package app.checkout;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;



import app.kafka.CheckoutInformationProducer;

@Service
public class CheckoutBackofficeService {

    Logger logger = LoggerFactory.getLogger(CheckoutBackofficeService.class);



	private final CheckoutInformationProducer checkoutInformationProducer;


	CheckoutBackofficeService(


		CheckoutInformationProducer checkoutInformationProducer

)



{

		this.checkoutInformationProducer = checkoutInformationProducer;

}

	public void publishCheckoutInformation(){
		logger.info("publishCheckoutInformation executed");
		//TODO: Implement Behaviour
	}

}
