package onlineshoppingproject.onlineshopping;

import java.util.List;

public class Cart {
	private User user;
	private List<Product> productList;
	private float total_amount;
	private boolean status;
	private boolean confirmOrder;

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(User user, List<Product> productList, float total_amount, boolean status, boolean confirmOrder) {
		super();
		this.user = user;
		this.productList = productList;
		this.total_amount = total_amount;
		this.status = status;
		this.confirmOrder = confirmOrder;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public float getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(float total_amount) {
		this.total_amount = total_amount;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean isConfirmOrder() {
		return confirmOrder;
	}

	public void setConfirmOrder(boolean confirmOrder) {
		this.confirmOrder = confirmOrder;
	}

}
