package tw.brad.stest1;

import org.springframework.stereotype.Component;

@Component	// => Bean => Spring
public class Bike1 implements Bike{
	private int i;
	public Bike1() {
		System.out.println("Bike1()");
	}
	
	public void upSpeed() {
		System.out.println("Bike1:upSpeed()" + i++);
	}

	public void downSpeed() {
		System.out.println("Bike1:downSpeed()");
	}

}
