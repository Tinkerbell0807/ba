package app.customer;

import org.springframework.stereotype.Component;

@Component
public class CustomerFactory {
		public CustomerEntity createCustomerEntity(){
			//TODO: Map Data (Parameters) to Object
			return new CustomerEntity();
		}

		private void fraudDetectionForCustomer(){
			//TODO:Implement
		}
}
