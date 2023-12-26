package app.customer;

import app.kafka.CustomerProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class CustomerRegistrationService {

    Logger logger = LoggerFactory.getLogger(CustomerRegistrationService.class);
    private final CustomerFactory customerFactory;
    private final CustomerRepository customerRepository;
    private final CustomerProducer customerProducer;

    CustomerRegistrationService
            (
                    CustomerFactory customerFactory
                    , CustomerRepository customerRepository
                    , CustomerProducer customerProducer
            ) {
        this.customerFactory = customerFactory;
        this.customerRepository = customerRepository;
        this.customerProducer = customerProducer;
    }

    public void registerCustomer() {
        logger.info("registerCustomer executed");
        //TODO: Implement Behaviour
        throw new RuntimeException("NotYetImplemented");
    }

}
