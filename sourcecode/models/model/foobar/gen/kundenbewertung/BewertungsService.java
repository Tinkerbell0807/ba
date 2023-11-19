package  kundenbewertung;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class BewertungsService {

	private final BewertungsRepository bewertungsRepository;
    private final WebClient webClient;

    Logger logger = LoggerFactory.getLogger(BewertungsService.class);

    public BewertungsService(
		BewertungsRepository bewertungsRepository,
		WebClient webClient){
        	this.webClient = webClient;
			this.bewertungsRepository = bewertungsRepository;
    }

}
