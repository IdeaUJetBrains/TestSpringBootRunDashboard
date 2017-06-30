package springboot_test5.demo5;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class MyHealthIndicator5 implements HealthIndicator {

    @Override
    public Health health() {
        int errorCode = 1; // perform some specific health check
        System.out.println("health_check5");
        if (errorCode != 0) {
            return Health.down().withDetail("Error Code5 (in MyHealthIndicator5 class)", errorCode).build();
        }
        return Health.up().build();
    }

}
