package petstoregradleproject;

import org.springframework.beans.factory.annotation.Required;

public class Person {
	private String personName;
	private int age;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public int getAge() {
		return age;
	}

	@Required
	public void setAge(int age) {
		this.age = age;
	}
}
