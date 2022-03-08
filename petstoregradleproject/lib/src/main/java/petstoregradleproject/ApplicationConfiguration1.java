package petstoregradleproject;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ApplicationConfiguration1 {
	@Bean("person")
	public Person getPerson() {
		Person obj = new Person();
		obj.setPersonName("Shubham");
		obj.setAge(23);
		return obj;
	}
}