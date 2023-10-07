package app.customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import app.customer.CustomerFactory;

import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import org.springframework.beans.factory.annotation.Value;

import app.kafka.CustomerProducer;

@Service
public class TestService {

    Logger logger = LoggerFactory.getLogger(TestService.class);

	private final CustomerFactory customerFactory;


	private final CustomerProducer customerProducer;

    private final WebClient webClient;

            @Value("${external-services.backoffice-service.base-url}")
            private String backofficeBaseUrl;


	TestService(

	CustomerFactory customerFactory

		,
		CustomerProducer customerProducer

		,
		WebClient webClient
)



{
		this.customerFactory = customerFactory;

		this.customerProducer = customerProducer;

    	this.webClient = webClient;
}


        private Mono<String> requestGetOrder() {
            logger.info("requestGetOrder executed");
            return webClient.get()
                    .uri(backofficeBaseUrl + "/getOrder")
					.retrieve()
					.bodyToMono(String.class);
		}
}
