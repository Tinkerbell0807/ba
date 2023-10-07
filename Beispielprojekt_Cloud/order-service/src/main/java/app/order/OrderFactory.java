package app.order;

import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.UUID;

@Component
public class OrderFactory {
    public OrderEntity createOrderEntity(UUID customerUuid) {
        var order = new OrderEntity();
        order.setOrderUuid(UUID.randomUUID());
        order.setOrderValue(calcValue());
        order.setCustomerUuid(customerUuid);
        return order;
    }

    private String calcValue() {
        Random random = new Random();

        // Generate the numbers
        int firstNumber = random.nextInt(1000); // 0 to 999
        int secondNumber = random.nextInt(10);  // 0 to 9
        int thirdNumber = random.nextInt(10);   // 0 to 9

        // Format and concatenate into a string
        return String.format("%d,%d%d €", firstNumber, secondNumber, thirdNumber);

    }

}
