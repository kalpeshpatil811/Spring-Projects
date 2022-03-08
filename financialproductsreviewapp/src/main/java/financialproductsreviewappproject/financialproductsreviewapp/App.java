package financialproductsreviewappproject.financialproductsreviewapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("ratingapp.xml");

		FinancialProduct financialProduct = context.getBean("financialProduct", FinancialProduct.class);
		System.out.println(financialProduct.getProductId());
		System.out.println(financialProduct.getProductName());
		System.out.println(financialProduct.getDescription());
		System.out.println(financialProduct.getRating());
		System.out.println("=========================================");

		User user = context.getBean("user", User.class);
		System.out.println(user.getUserName());
		System.out.println(user.getEmailId());
		System.out.println(user.getPassword());
		System.out.println(user.getMobileNo());
		System.out.println("=========================================");

		System.out.println(financialProduct.getReview().getReviewId());
		System.out.println(financialProduct.getReview().getProduct_reviewed());
		System.out.println(financialProduct.getReview().getReview_text());
		System.out.println("=========================================");

		for (Comment c : financialProduct.getReview().getComments()) {
			System.out.println(c.getCommentId());
			System.out.println(c.getCommentText());
			System.out.println(c.getLikes());
			System.out.println(c.getDislikes());
			System.out.println(c.isReport());
			System.out.println();
		}
	}
}