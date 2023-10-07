// Start of user code Entity
package app.order;

import java.util.UUID;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class OrderEntity {

    @Id
    private UUID orderUuid;

    public UUID getCustomerUuid() {
        return customerUuid;
    }

    public void setCustomerUuid(UUID customerUuid) {
        this.customerUuid = customerUuid;
    }

    public String getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(String orderValue) {
        this.orderValue = orderValue;
    }

    private UUID customerUuid;

    private String orderValue;

    public void setOrderUuid(UUID id) {
        this.orderUuid = id;
    }

    public UUID getOrderUuid() {
        return orderUuid;
    }
}

// End of user code
