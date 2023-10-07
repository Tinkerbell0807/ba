package app.order;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class OrderFactory {
    public OrderEntity createOrderEntity(UUID customerUuid) {
        //TODO: Map Data (Parameters) to Object
        return new OrderEntity();
    }

    private void calcValue() {
        //TODO:Implement
    }
}
