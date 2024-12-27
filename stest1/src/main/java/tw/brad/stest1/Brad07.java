package tw.brad.stest1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/brad07")
@RestController
public class Brad07 {

	@RequestMapping("/m1")
	public void m1() {
		User user = new User();
		System.out.println(user.getName());
	}
	
	
}
