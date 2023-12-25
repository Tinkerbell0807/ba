package marketing;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarketNotificationRepository extends JpaRepository<MarketingNotificationEntity, String> {

}
