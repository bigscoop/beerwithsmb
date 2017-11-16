package ch.puzzle.jafakafi.intentions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class IntentionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntentionsApplication.class, args);
	}
}
