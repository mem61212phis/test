package tw.brad.stest1;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

/*
 * RESTful
 * POST : Create
 * GET : Read
 * PUT : Update
 * DELETE : Delete
 */

@RestController
@RequestMapping("/brad041")
public class Brad041 {

	@GetMapping("/users")
	public void m1() {
		System.out.println("m1");
	}
	
	@GetMapping("/user/{id}")
	public void m2(@PathVariable @Min(10) @Max(20) Integer id) {
		System.out.println("m2:" + id);
	}
	
	@GetMapping("/user/{id}/bike/{bid}")
	public void m3(@PathVariable Integer id, @PathVariable Integer bid) {
		System.out.println("m2:" + id + ", bike: " + bid);
	}
	
	@PostMapping("/user")
	public void m4(@RequestBody @Valid User user) {
		System.out.println("m4: " + user.getName());
	}

	@PutMapping("/user/{id}")
	public void m5(@RequestBody User user) {
		System.out.println("m5: " + user.getName());
	}
	
	@DeleteMapping("/user/{id}")
	public void m6(@PathVariable Integer id) {
		System.out.println("m6: " + id);
	}
	
}
