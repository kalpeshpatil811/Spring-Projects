package financialproductsreviewappproject.financialproductsreviewapp;

public class FinancialProduct {
	private int productId;
	private String productName;
	private String description;
	private int rating;
	private Review review;

	public FinancialProduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FinancialProduct(int productId, String productName, String description, int rating, Review review) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.description = description;
		this.rating = rating;
		this.review = review;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Review getReview() {
		return review;
	}

	public void setReview(Review review) {
		this.review = review;
	}

}
