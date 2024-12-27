package tw.brad.stest1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/brad03")
@RestController
public class Brad03 {
	@Autowired
	private Lottery bigLottery;
	
	@Autowired
	private Lottery powerLottery;
	
	@RequestMapping("/t1")
	public void test1() {
		System.out.println("OK");
		
		System.out.println(bigLottery.createLottery());
		System.out.println(powerLottery.createLottery());
		
	}
	
}
