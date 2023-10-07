package app.customer;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.UUID;

@Entity
public class CustomerContactAggregate {

    @Id
    private UUID id;

	public defaultEntityRootName defaultEntityRootName

	private defaultEntityNodeName defaultEntityNodeName;
	private defaultValueObjName defaultValueObjName;
	private defaultEntityNodeNumberTwo defaultEntityNodeNumberTwo;

	//TODO: Implement the remaining aggregates fields, getters and setters

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

}
