package app.customer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.UUID;

@Component
public class CustomerFactory {

	private final ObjectMapper objectMapper;

	@Autowired
	public CustomerFactory(ObjectMapper objectMapper) {
		this.objectMapper = objectMapper;
	}

	public CustomerEntity createCustomerEntity(String json) throws JsonProcessingException {
		var customer = new CustomerEntity();

		try {
			JsonNode jsonNode = objectMapper.readTree(json);
			String customerUuid = jsonNode.get("customerUuid").asText();
			String name = jsonNode.get("name").asText();

			customer.setCustomerUuid(UUID.fromString(customerUuid));
			customer.setName(name);
			customer.setOrderCount(0);
		} catch (IOException e) {
			throw e;
		}

		return customer;
	}
}