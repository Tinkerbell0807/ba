package app.order;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.UUID;

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
