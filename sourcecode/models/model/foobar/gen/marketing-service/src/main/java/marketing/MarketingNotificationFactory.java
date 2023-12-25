package marketing;

import org.springframework.stereotype.Component;

@Component
public class MarketingNotificationFactory {
		public MarketingNotificationEntity createMarketingNotificationEntity(){
			return new MarketingNotificationEntity();
		}

}
