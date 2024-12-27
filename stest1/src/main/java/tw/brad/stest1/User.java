package tw.brad.stest1;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/*
 * {
  		"name" : "brad",
  		"gender": true,
  		"age": 18
	}
 */
public class User {
	private Integer id;
	
	@NotNull
	private String name;
	
	private Boolean gender;
	
	private Integer age;
	
	@Pattern(regexp = "^[A-Z][01][0-9]{8}$")
	private String twid;
	
	@Email
	private String email;
	
	
	
	
	public String getTwid() {
		return twid;
	}
	public void setTwid(String twid) {
		this.twid = twid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getGender() {
		return gender;
	}
	public void setGender(Boolean gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	
}
