package  bearbeitungsticket;

import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class TicketController {

	private final TicketService ticketService;
    Logger logger = LoggerFactory.getLogger(TicketController.class);

    public TicketController(
		TicketService ticketService
		) {
        this.ticketService = ticketService;
    }
    


    @PostMapping("/postNewTicket")
    public String postNewTicket() {
		logger.info("postNewTicket executed");
        // TODO: not yet implemented
        return "200 OK from postNewTicket";
    }
}
