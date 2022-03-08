package financialproductsreviewappproject.financialproductsreviewapp;

import java.util.List;

public class Review {
	private int reviewId;
	private String product_reviewed;
	private String review_text;
	private List<Comment> comments;

	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Review(int reviewId, String product_reviewed, String review_text, List<Comment> comments) {
		super();
		this.reviewId = reviewId;
		this.product_reviewed = product_reviewed;
		this.review_text = review_text;
		this.comments = comments;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public String getProduct_reviewed() {
		return product_reviewed;
	}

	public void setProduct_reviewed(String product_reviewed) {
		this.product_reviewed = product_reviewed;
	}

	public String getReview_text() {
		return review_text;
	}

	public void setReview_text(String review_text) {
		this.review_text = review_text;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

}
