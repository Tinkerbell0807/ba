package  bearbeitungsticket;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class TicketService {

	private final TicketRepository ticketRepository;
    private final WebClient webClient;

    Logger logger = LoggerFactory.getLogger(TicketService.class);

    public TicketService(
		TicketRepository ticketRepository,
		WebClient webClient){
        	this.webClient = webClient;
			this.ticketRepository = ticketRepository;
    }

    public Mono<String> requestDeleteAnfrage() {
		logger.info("requestDeleteAnfrage executed");
        return webClient.delete()
                .uri("http://kundenanfrage-service.mycompany.org/deleteAnfrage")
                .retrieve()
                .bodyToMono(String.class);
    }
    public Mono<String> requestPostUpdatedAnfrage() {
		logger.info("requestPostUpdatedAnfrage executed");
        return webClient.post()
                .uri("http://kundenanfrage-service.mycompany.org/postUpdatedAnfrage")
                .retrieve()
                .bodyToMono(String.class);
    }
    public Mono<String> requestGetBewertung() {
		logger.info("requestGetBewertung executed");
        return webClient.get()
                .uri("http://kundenbewertung-service.mycompany.org/getBewertung")
                .retrieve()
                .bodyToMono(String.class);
    }
    public Mono<String> requestDeleteBewertung() {
		logger.info("requestDeleteBewertung executed");
        return webClient.delete()
                .uri("http://kundenbewertung-service.mycompany.org/deleteBewertung")
                .retrieve()
                .bodyToMono(String.class);
    }
}
