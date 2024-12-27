package tw.brad.stest1;

import org.springframework.stereotype.Component;

@Component
public class MabBike implements Bike{
	private int i;
	public MabBike() {
		System.out.println("MBike()");
	}
	
	public void upSpeed() {
		System.out.println("MBike:upSpeed()" + i++);
	}

	public void downSpeed() {
		System.out.println("MBike:downSpeed()");
	}

}
