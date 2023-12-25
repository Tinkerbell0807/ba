package order;

import org.springframework.stereotype.Component;

@Component
public class CheckoutOrderObjectFactory {
		public CheckoutOrderObject createCheckoutOrderObject(){
			return new CheckoutOrderObject();
		}

}
