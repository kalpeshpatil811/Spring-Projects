package petstoregradleproject;

import org.springframework.beans.factory.annotation.Autowired;

public class Account {
	private String email;
	@Autowired
	private Person person;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}
