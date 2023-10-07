package app.customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@Service
public class CustomerBonusService {

    private final WebClient webClient;
    Logger logger = LoggerFactory.getLogger(CustomerBonusService.class);
    @Value("${external-services.marketing-service.base-url}")
    private String marketingBaseUrl;

    CustomerBonusService(WebClient webClient) {
        this.webClient = webClient;
    }

    public void addBonusPointsToCustomer() {
        logger.info("addBonusPointsToCustomer executed");
        //TODO: Implement Behaviour
    }

    public void triggerMarketing() {
        logger.info("triggerMarketing executed");
        //TODO: Implement Behaviour
    }

    private Mono<String> requestTriggerNotificationForCustomer() {
        logger.info("requestTriggerNotificationForCustomer executed");
        return webClient.post().uri(marketingBaseUrl + "/triggerNotificationForCustomer").retrieve().bodyToMono(String.class);
    }
}
