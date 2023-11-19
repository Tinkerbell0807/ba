package  kundenbewertung;

import org.springframework.stereotype.Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Repository
public class BewertungsRepository {

	Logger logger = LoggerFactory.getLogger(BewertungsRepository.class);

	public void doDatabaseStuff(){
		logger.info("doDatabaseStuff() executed");
		//TODO: not yet implemented
	}
}
