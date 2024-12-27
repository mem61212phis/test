package tw.brad.stest1;

import org.springframework.stereotype.Component;

@Component
public class Bike2 implements Bike {
	private int i;
	public Bike2() {
		System.out.println("Bike2()");
	}
	
	public void upSpeed() {
		System.out.println("Bike2:upSpeed()" + i++);
	}

	public void downSpeed() {
		System.out.println("Bike2:downSpeed()");
	}
}
