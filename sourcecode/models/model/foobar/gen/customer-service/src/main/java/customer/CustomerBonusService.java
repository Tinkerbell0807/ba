package customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import customer.CustomerMarketingObject;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class CustomerBonusService {

    Logger logger = LoggerFactory.getLogger(CustomerBonusService.class);
	private final CustomerMarketingObject customerMarketingObject;
    private final WebClient webClient;

	CustomerBonusService(CustomerMarketingObject customerMarketingObject,WebClient webClient){
		this.customerMarketingObject = customerMarketingObject;
    	this.webClient = webClient;
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

    private Mono<String> requestTriggerNotificationForCustomer() {
		logger.info("requestTriggerNotificationForCustomer executed");
        return webClient.post()
                .uri("microservice-domain.org/triggerNotificationForCustomer")
                .retrieve()
                .bodyToMono(String.class);
    }
}
