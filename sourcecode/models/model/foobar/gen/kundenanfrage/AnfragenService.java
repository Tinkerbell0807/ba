package  kundenanfrage;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class AnfragenService {

	private final BestellungsRepository bestellungsRepository;
	private final AnfragenRepository anfragenRepository;
    private final WebClient webClient;

    Logger logger = LoggerFactory.getLogger(AnfragenService.class);

    public AnfragenService(
		BestellungsRepository bestellungsRepository,
		AnfragenRepository anfragenRepository,
		WebClient webClient){
        	this.webClient = webClient;
			this.bestellungsRepository = bestellungsRepository;
			this.anfragenRepository = anfragenRepository;
    }

    public Mono<String> requestPostNewTicket() {
		logger.info("requestPostNewTicket executed");
        return webClient.post()
                .uri("http://bearbeitungsticket-service.mycompany.org/postNewTicket")
                .retrieve()
                .bodyToMono(String.class);
    }
    public Mono<String> requestPostBewertung() {
		logger.info("requestPostBewertung executed");
        return webClient.post()
                .uri("http://kundenbewertung-service.mycompany.org/postBewertung")
                .retrieve()
                .bodyToMono(String.class);
    }
}
