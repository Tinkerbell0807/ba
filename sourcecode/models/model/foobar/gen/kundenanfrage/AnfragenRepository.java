package  kundenanfrage;

import org.springframework.stereotype.Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Repository
public class AnfragenRepository {

	Logger logger = LoggerFactory.getLogger(AnfragenRepository.class);

	public void doDatabaseStuff(){
		logger.info("doDatabaseStuff() executed");
		//TODO: not yet implemented
	}
}
