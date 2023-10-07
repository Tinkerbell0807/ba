package app.customer;

// Start of user code Imports

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import app.customer.CustomerFactory;
import app.customer.CustomerRepository;


import app.kafka.CustomerProducer;

// End of user code

@Service
public class CustomerRegistrationService {

// Start of user code Members

    Logger logger = LoggerFactory.getLogger(CustomerRegistrationService.class);

	private final CustomerFactory customerFactory;
	private final CustomerRepository customerRepository;

	private final CustomerProducer customerProducer;


// End of user code

// Start of user code Constructor
	CustomerRegistrationService(
	CustomerFactory customerFactory
	,
	CustomerRepository customerRepository

		,
		CustomerProducer customerProducer

)



{
		this.customerFactory = customerFactory;
		this.customerRepository = customerRepository;

		this.customerProducer = customerProducer;

// End of user code

// Start of user code registerCustomer
	public void registerCustomer(){
		logger.info("registerCustomer executed");
		//TODO: Implement Behaviour
	}
// End of user code



// Start of user code additional protected methods
// End of user code
}
