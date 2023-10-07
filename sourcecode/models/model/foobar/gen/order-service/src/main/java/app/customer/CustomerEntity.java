// Start of user code Entity
package app.customer;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class CustomerEntity {

    @Id
    private UUID customerUuid;
    private String name;
    private int orderCount;

    public int getOrderCount() {return orderCount;}
    public void setOrderCount(int orderCount) {this.orderCount = orderCount;}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public UUID getCustomerUuid() {
        return customerUuid;
    }
    public void setCustomerUuid(UUID id) {
        this.customerUuid = id;
    }
}

// End of user code
