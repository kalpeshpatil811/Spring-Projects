package petstoregradleproject;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Payment {
	private float amount;
	@Autowired
	@Qualifier("person")
	private Person person;
	@Resource(name="person1")
	private Person person1;

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public float getAmount() {
		return amount;
	}

	@Required
	public void setAmount(float amount) {
		this.amount = amount;
	}

	public Person getPerson() {
		return person;
	}
	
	public void setPerson(Person person) {
		this.person = person;
	}

	public Person getPerson1() {
		return person1;
	}

	public void setPerson1(Person person1) {
		this.person1 = person1;
	}

}
