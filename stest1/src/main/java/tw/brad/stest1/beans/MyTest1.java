package tw.brad.stest1.beans;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class MyTest1 {

	public MyTest1() {
		this(3);
		System.out.println("MyTest1()");
		m1();
	}
	public MyTest1(int a) {
		System.out.println("MyTest1(int)");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init()");
	}
	
	public void m1() {
		System.out.println("m1()");
	}
	
}
