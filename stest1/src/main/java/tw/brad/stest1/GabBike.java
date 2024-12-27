package tw.brad.stest1;

import org.springframework.stereotype.Component;

@Component
public class GabBike implements Bike{
	private int i;
	public GabBike() {
		System.out.println("GabBike()");
	}
	
	public void upSpeed() {
		System.out.println("GabBike:upSpeed()" + i++);
	}

	public void downSpeed() {
		System.out.println("GBike:downSpeed()");
	}
	
	public double getSpeed() {
		return 1.2;
	}
	
}
