package order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class OrderProcessService {

    Logger logger = LoggerFactory.getLogger(OrderProcessService.class);
	private final CustomerRepository customerRepository;
	private final OrderRepository orderRepository;
	private final OrderFactory orderFactory;

	OrderProcessService(CustomerRepository customerRepository,OrderRepository orderRepository,OrderFactory orderFactory){
		this.customerRepository = customerRepository;
		this.orderRepository = orderRepository;
		this.orderFactory = orderFactory;
	}

}

