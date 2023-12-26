package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class ApplicationStarter {
   public static void main(String[] args) {
      SpringApplication.run(ApplicationStarter.class, args);
   }
}
