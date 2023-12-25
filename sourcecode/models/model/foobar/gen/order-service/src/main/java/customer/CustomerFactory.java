package customer;

import org.springframework.stereotype.Component;

@Component
public class CustomerFactory {
		public CustomerEntity createCustomerEntity(){
			return new CustomerEntity();
		}

}
