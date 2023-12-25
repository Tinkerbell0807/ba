package customer;

import org.springframework.stereotype.Component;

@Component
public class CustomerRewardObjectFactory {
		public CustomerRewardObject createCustomerRewardObject(){
			return new CustomerRewardObject();
		}

}
