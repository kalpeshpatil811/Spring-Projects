package petstoregradleproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
	@Bean("person")
	public Person getPerson() {
		Person obj = new Person();
		obj.setPersonName("Kalpesh");
		obj.setAge(22);
		return obj;
	}
}
