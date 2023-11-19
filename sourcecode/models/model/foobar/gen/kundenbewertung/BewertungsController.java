package  kundenbewertung;

import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class BewertungsController {

	private final BewertungsService bewertungsService;
    Logger logger = LoggerFactory.getLogger(BewertungsController.class);

    public BewertungsController(
		BewertungsService bewertungsService
		) {
        this.bewertungsService = bewertungsService;
    }
    


    @PostMapping("/postBewertung")
    public String postBewertung() {
		logger.info("postBewertung executed");
        // TODO: not yet implemented
        return "200 OK from postBewertung";
    }

    @GetMapping("/getBewertung")
    public String getBewertung() {
		logger.info("getBewertung executed");
        // TODO: not yet implemented
        return "200 OK from getBewertung";
    }

    @DeleteMapping("/deleteBewertung")
    public String deleteBewertung() {
		logger.info("deleteBewertung executed");
        // TODO: not yet implemented
        return "200 OK from deleteBewertung";
    }
}
