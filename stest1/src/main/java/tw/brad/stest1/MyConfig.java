package tw.brad.stest1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class MyConfig {
	public MyConfig() {
		System.out.println("MyConfig");
	}
	@Bean
	public Test1 getTest1() {
		
		return new Test1(135);
	}
	
	@Bean
	public Test2 getTest2() {
		
		return new Test2();
	}
	
}
