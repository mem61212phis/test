package tw.brad.stest1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/brad06")
public class Brad06 {
	
	@Value("${company.name}")
	private String companyName;
	
	@Value("${company.id}")
	private String companyId;
	
	@Value("${age}")
	private Integer age;

	@Value("${title:OK}")
	private String title;

	@RequestMapping("/m1")
	public String m1() {
		String content = String.format("<h1>%s</h1>", companyName) +
				String.format("<div>%s</div>", companyId) +
				String.format("<div>%s</div>", title) +
				String.format("<div>Age: %d</div>", age) ;
		return content;
	}
	
	
}
