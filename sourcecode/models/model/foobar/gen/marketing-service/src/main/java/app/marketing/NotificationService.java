package app.marketing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import app.marketing.MarketingNotification;

import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import org.springframework.beans.factory.annotation.Value;

import app.kafka.NotificationProducer;

@Service
public class NotificationService {

    Logger logger = LoggerFactory.getLogger(NotificationService.class);


	private final NotificationProducer notificationProducer;

    private final WebClient webClient;

            @Value("${external-services.customer-service.base-url}")
            private String customerBaseUrl;


	NotificationService(

		NotificationProducer notificationProducer

		,
		WebClient webClient
)



{
		this.marketingNotification = marketingNotification;

		this.notificationProducer = notificationProducer;

    	this.webClient = webClient;
}

	public void generateGiftCode(){
		logger.info("generateGiftCode executed");
		//TODO: Implement Behaviour
	}

        private Mono<String> requestGetCustomerBonusInformation() {
            logger.info("requestGetCustomerBonusInformation executed");
            return webClient.get()
                    .uri(customerBaseUrl + "/getCustomerBonusInformation")
					.retrieve()
					.bodyToMono(String.class);
		}
}
