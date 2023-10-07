package app.backoffice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import app.notification.NotificationRepository;
import app.order.OrderRepository;
import app.customer.CustomerRepository;
import app.checkout.CheckoutRepository;



@Service
public class DataSearchService {

    Logger logger = LoggerFactory.getLogger(DataSearchService.class);

	private final NotificationRepository notificationRepository;
	private final OrderRepository orderRepository;
	private final CustomerRepository customerRepository;
	private final CheckoutRepository checkoutRepository;



	DataSearchService(
	NotificationRepository notificationRepository
	,
	OrderRepository orderRepository
	,
	CustomerRepository customerRepository
	,
	CheckoutRepository checkoutRepository


)



{
		this.notificationRepository = notificationRepository;
		this.orderRepository = orderRepository;
		this.customerRepository = customerRepository;
		this.checkoutRepository = checkoutRepository;


}


}
