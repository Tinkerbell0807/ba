// Start of user code Repository
package app.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, String> {
	List<CustomerEntity> findByOrderCountLessThan(int orderCountThreshold);
}

// End of user code
