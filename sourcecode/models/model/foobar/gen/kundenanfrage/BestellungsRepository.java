package  kundenanfrage;

import org.springframework.stereotype.Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Repository
public class BestellungsRepository {

	Logger logger = LoggerFactory.getLogger(BestellungsRepository.class);

	public void doDatabaseStuff(){
		logger.info("doDatabaseStuff() executed");
		//TODO: not yet implemented
	}
}
