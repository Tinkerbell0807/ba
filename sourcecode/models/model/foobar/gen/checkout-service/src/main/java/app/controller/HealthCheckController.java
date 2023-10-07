package app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.time.Duration;
import java.time.Instant;

@RestController
public class HealthCheckController {

    private Instant startTime;

    @Value("${service-properties.service-name}")
    private String serviceName;


    @PostConstruct
    public void init() {
        startTime = Instant.now();
    }

    @GetMapping("/health")
    public ResponseEntity<HealthCheckResponse> healthCheck() {
        HealthCheckResponse response = new HealthCheckResponse();
        response.setStatus("OK");
        response.setServiceName(serviceName);
        Duration uptimeDuration = Duration.between(startTime, Instant.now());
        response.setUptime(uptimeDuration.toString());

        return ResponseEntity.ok(response);
    }

    static class HealthCheckResponse {
        private String status;
        private String serviceName;
        private String uptime;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getServiceName() {
            return serviceName;
        }

        public void setServiceName(String serviceName) {
            this.serviceName = serviceName;
        }

        public String getUptime() {
            return uptime;
        }

        public void setUptime(String uptime) {
            this.uptime = uptime;
        }
    }
}
