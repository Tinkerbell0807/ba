package app.customer;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.UUID;

@Entity
public class defaultEntityNodeName {

    @Id
    private UUID id;

	//TODO: Implement the entities fields, getters and setters

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

	private void testBehav(){
		logger.info("testBehav executed");
		//TODO: Implement Behaviour
	}
}
