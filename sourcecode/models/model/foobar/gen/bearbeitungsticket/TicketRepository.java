package  bearbeitungsticket;

import org.springframework.stereotype.Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Repository
public class TicketRepository {

	Logger logger = LoggerFactory.getLogger(TicketRepository.class);

	public void doDatabaseStuff(){
		logger.info("doDatabaseStuff() executed");
		//TODO: not yet implemented
	}
}
