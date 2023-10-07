package app.order;

import org.springframework.stereotype.Component;

@Component
public class OrderFactory {
		public OrderEntity createOrderEntity(){
			//TODO: Map Data (Parameters) to Object
			return new OrderEntity();
		}

		private void calcValue(){
			//TODO:Implement
		}
}
