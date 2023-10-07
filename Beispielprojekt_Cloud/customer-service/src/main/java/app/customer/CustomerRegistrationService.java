package app.customer;

import app.kafka.CustomerProducer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerRegistrationService {

    private final ObjectMapper objectMapper;
    private final CustomerFactory customerFactory;
    private final CustomerRepository customerRepository;
    private final CustomerProducer customerProducer;
    Logger logger = LoggerFactory.getLogger(CustomerRegistrationService.class);


    CustomerRegistrationService(ObjectMapper objectMapper, CustomerFactory customerFactory, CustomerRepository customerRepository, CustomerProducer customerProducer) {
        this.objectMapper = objectMapper;
        this.customerFactory = customerFactory;
        this.customerRepository = customerRepository;
        this.customerProducer = customerProducer;
    }

    @Scheduled(cron = "*/15 * * * * *")
    public void registerCustomer() {
        var uuid = UUID.randomUUID();
        try {
            var customerEntity = customerFactory.createCustomerEntity(uuid);
            customerRepository.save(customerEntity);
            logger.info("Created customer [{}]", uuid);
            try {
                String json = objectMapper.writeValueAsString(customerEntity);
                customerProducer.sendMessage(json);
            } catch (JsonProcessingException e) {
                logger.error("Error converting customer entity to JSON", e);
            }
        } catch (Exception e) {
            logger.error("Fraud detected !");
        }
    }

}
