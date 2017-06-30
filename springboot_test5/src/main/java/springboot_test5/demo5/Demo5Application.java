package springboot_test5.demo5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demo5Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo5Application.class, args);
	}


	@Bean
	public HealthIndicator db_or_smthHealthIndicator() {
		return new HealthIndicator() {

			@Override
			public Health health() {
				return Health.status(Status.UP).withDetail("db_or_smth_key_in_Demo5Application_class", "db_or_smth_bla_bla").build();
			}
		};
	}

	@Bean
	public HealthIndicator one_more_test5HealthIndicator() {
		return new HealthIndicator() {

			@Override
			public Health health() {
				return Health.status(Status.UP).withDetail("one_more_test5_key_in_Demo5Application_class", "one_more_test5_bla_bla").build();
			}
		};
	}

}
