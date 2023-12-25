package order;

import org.springframework.stereotype.Component;

@Component
public class OrderFactory {
		public OrderEntity createOrderEntity(){
			return new OrderEntity();
		}

}
