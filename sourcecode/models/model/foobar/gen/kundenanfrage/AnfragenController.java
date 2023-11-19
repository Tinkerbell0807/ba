package  kundenanfrage;

import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class AnfragenController {

	private final AnfragenService anfragenService;
    Logger logger = LoggerFactory.getLogger(AnfragenController.class);

    public AnfragenController(
		AnfragenService anfragenService
		) {
        this.anfragenService = anfragenService;
    }
    


    @PostMapping("/postUpdatedAnfrage")
    public String postUpdatedAnfrage() {
		logger.info("postUpdatedAnfrage executed");
        // TODO: not yet implemented
        return "200 OK from postUpdatedAnfrage";
    }

    @DeleteMapping("/deleteAnfrage")
    public String deleteAnfrage() {
		logger.info("deleteAnfrage executed");
        // TODO: not yet implemented
        return "200 OK from deleteAnfrage";
    }

    @PostMapping("/postNewAnfrage")
    public String postNewAnfrage() {
		logger.info("postNewAnfrage executed");
        // TODO: not yet implemented
        return "200 OK from postNewAnfrage";
    }
}
