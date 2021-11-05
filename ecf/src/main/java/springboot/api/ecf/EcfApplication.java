package springboot.api.ecf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EcfApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcfApplication.class, args);
	}

}
