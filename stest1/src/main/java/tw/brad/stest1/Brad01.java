package tw.brad.stest1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Brad01 {
	public Brad01() {
		System.out.println("Brad01()");	
	}
	
	@RequestMapping("/brad01")
	public String test1() {
		System.out.println("Hello, Brad");
		return "Hello, World1";
	}
	
	@RequestMapping("/brad02")
	public String test2() {
		System.out.println("Hello, Brad");
		return "Hello, World2";
	}
	@RequestMapping("/brad03")
	public String test3() {
		System.out.println("Hello, Brad");
		return "Hello, World3";
	}
	
}
