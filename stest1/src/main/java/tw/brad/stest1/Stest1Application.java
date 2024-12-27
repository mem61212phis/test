package tw.brad.stest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"tw.brad", "test3"})
public class Stest1Application {

	public static void main(String[] args) {
		SpringApplication.run(Stest1Application.class, args);
	}

}
