package marketing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import marketing.MarketingNotification;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;import kafka.NotificationProducer;


@Service
public class NotificationService {

    Logger logger = LoggerFactory.getLogger(NotificationService.class);
	private final MarketingNotification marketingNotification;
	private final NotificationProducer notificationProducer;
    private final WebClient webClient;

	NotificationService(MarketingNotification marketingNotification,NotificationProducer notificationProducer,WebClient webClient){
		this.marketingNotification = marketingNotification;
		this.notificationProducer = notificationProducer;
    	this.webClient = webClient;
	}

	public void generateGiftCode(){
		logger.info("generateGiftCode executed");
		//TODO: Implement Behaviour
		throw new RuntimeException("NotYetImplemented");
	}

    private Mono<String> requestGetCustomerBonusInformation() {
		logger.info("requestGetCustomerBonusInformation executed");
        return webClient.get()
                .uri("microservice-domain.org/getCustomerBonusInformation")
                .retrieve()
                .bodyToMono(String.class);
    }
}
