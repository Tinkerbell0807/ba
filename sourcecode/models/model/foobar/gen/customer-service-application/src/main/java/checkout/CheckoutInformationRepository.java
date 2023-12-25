package checkout;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckoutInformationRepository extends JpaRepository<CheckoutInformationEntity, String> {

}
