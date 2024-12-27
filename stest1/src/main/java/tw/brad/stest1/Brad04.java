package tw.brad.stest1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/brad04")
@RestController
public class Brad04 {

	@RequestMapping("/m1")
	public String m1(@RequestParam(required = false, defaultValue = "0") Integer x, 
			@RequestParam(required = false, defaultValue = "0") Integer y) {
		System.out.println("OK");
		int r = x + y;
		
		return String.format("%d + %d = %d", x, y, r);
	}
	
	@RequestMapping("/m2")
	public void m2(@RequestBody User user) {
		System.out.println(user.getName() + ":" + user.getAge());
	}
	
	@RequestMapping("/m3/{name}/{id}")
	public void m3(@PathVariable Integer id, @PathVariable String name) {
		System.out.printf("name = %s\n", name);
		System.out.printf("id = %d", id);
	}
	
	@RequestMapping("/m4")
	public void m4(@RequestHeader String x, @RequestHeader String y,
				@RequestHeader(name = "Content-Type") String content) {
		System.out.printf("%s x = %s; y = %s", content, x, y);
	}
	
	
	
}
