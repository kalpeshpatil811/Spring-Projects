package petstoreproject.petstoreapp;

public class CustomerService {
	private long serviceHelplineNumber;
	private String councellorName;

	private CustomerService() {
		super();
		this.serviceHelplineNumber = 9876543210L;
		this.councellorName = "David";
	}

	public long getServiceHelplineNumber() {
		return serviceHelplineNumber;
	}

	public String getCouncellorName() {
		return councellorName;
	}

	private static CustomerService customerService = new CustomerService();

	public static CustomerService createCustomerSeriveHelplineNumber() {
		return customerService;
	}
}
