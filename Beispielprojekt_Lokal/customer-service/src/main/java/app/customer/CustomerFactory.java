package app.customer;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;
import java.util.UUID;

@Component
public class CustomerFactory {
    private final Random random = new Random();

    public CustomerEntity createCustomerEntity(UUID id) {
        var customer = new CustomerEntity();
        customer.setCustomerUuid(id);
        customer.setName(generateName());
        return customer;
    }

    private String generateName() {
        List<String> vornamen = List.of("Max", "Lukas", "Leon", "Felix", "Noah", "Tim", "David");
        List<String> mittelnamen = List.of("Alexander", "Paul", "Julian", "Elias", "Lukas", "Simon", "Jakob");
        List<String> nachnamen = List.of("Müller", "Schmidt", "Schneider", "Fischer", "Weber", "Meyer", "Wagner");

        String vorname = randomNameFrom(vornamen);
        String mittelname = randomNameFrom(mittelnamen);
        String nachname = randomNameFrom(nachnamen);

        return vorname + " " + mittelname + " " + nachname;
    }

    private String randomNameFrom(List<String> names) {
        int index = random.nextInt(names.size());
        return names.get(index);
    }

    private void fraudDetectionForCustomer() {
        //TODO:Implement
    }
}
