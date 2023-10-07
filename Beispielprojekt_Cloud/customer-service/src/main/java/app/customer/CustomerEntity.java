package app.customer;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.UUID;

@Entity
public class CustomerEntity {

    @Id
    private UUID customerUuid;
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCustomerUuid(UUID id) {
        this.customerUuid = id;
    }
    public UUID getCustomerUuid() {
        return customerUuid;
    }
}
