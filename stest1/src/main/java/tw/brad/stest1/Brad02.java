package tw.brad.stest1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Brad02 {

	@Autowired
	@Qualifier("gabBike")
	private Bike bike1;
	
	@Autowired
	@Qualifier("mabBike")
	private Bike bike2;
	
	public Brad02() {
		System.out.println("Brad02()");
	}
	
	@RequestMapping("/brad021")
	public String brad021() {
		bike1.upSpeed();
		bike2.upSpeed();
		
		GabBike bike11 = (GabBike)bike1;
		System.out.println(bike11.getSpeed());
		
		return null;
	}
	
}
