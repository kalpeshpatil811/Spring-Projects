package petstoreproject.petstoreapp;

public class Customer {
	private String customerName;
	private String address;
	private String email;
	private long mobile;
	private CustomerService customerService;

	public Customer() {
		super();
	}

	public Customer(String customerName, String address, String email, long mobile) {
		super();
		this.customerName = customerName;
		this.address = address;
		this.email = email;
		this.mobile = mobile;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public CustomerService getCustomerService() {
		return customerService;
	}

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
}
