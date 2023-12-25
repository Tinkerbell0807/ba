package marketing;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarketingNotificationRepository extends JpaRepository<MarketingNotificationEntity, String> {

}
