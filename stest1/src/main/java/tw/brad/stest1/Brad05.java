package tw.brad.stest1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/brad05")
public class Brad05 {
	@Autowired
	private Test1 test1;
	@RequestMapping("/m1")
	public void m1() {
		test1.printI();
	}
	
}
