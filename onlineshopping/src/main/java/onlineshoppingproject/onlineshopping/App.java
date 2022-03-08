package onlineshoppingproject.onlineshopping;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("onlineshopping.xml");

		User user = context.getBean("user1", User.class);
		System.out.println(user.getUsername());
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		System.out.println(user.getShipping_address());
		System.out.println(user.getBilling_address());
		System.out.println("=========================================");

		Product product = context.getBean("product1", Product.class);
		System.out.println(product.getProduct_name());
		System.out.println(product.getPrice());
		System.out.println(product.getQuantity_in_stock());
		System.out.println(product.getImagelocation());
		System.out.println("=========================================");

		Cart cart = context.getBean("cart1", Cart.class);
		System.out.println(cart.getUser().getUsername());
		System.out.println(cart.getUser().getEmail());
		System.out.println(cart.getUser().getPassword());
		System.out.println(cart.getUser().getShipping_address());
		System.out.println(cart.getUser().getBilling_address());
		System.out.println();

		List<Product> productList = cart.getProductList();
		for (Product p : productList) {
			System.out.println(p.getProduct_name());
			System.out.println(p.getPrice());
			System.out.println(p.getQuantity_in_stock());
			System.out.println(p.getImagelocation());
			System.out.println();
		}

		System.out.println(cart.getTotal_amount());
		System.out.println(cart.isStatus());
		System.out.println(cart.isConfirmOrder());
		System.out.println("=========================================");
		System.out.println();

		Order order = context.getBean("order", Order.class);
		List<Cart> cartList = order.getCartList();
		for (Cart c : cartList) {
			System.out.println(c.getUser().getUsername());
			System.out.println(c.getUser().getEmail());
			System.out.println(c.getUser().getPassword());
			System.out.println(c.getUser().getShipping_address());
			System.out.println(c.getUser().getBilling_address());
			System.out.println();

			List<Product> productList1 = c.getProductList();
			for (Product p : productList1) {
				System.out.println(p.getProduct_name());
				System.out.println(p.getPrice());
				System.out.println(p.getQuantity_in_stock());
				System.out.println(p.getImagelocation());
				System.out.println();
			}

			System.out.println(c.getTotal_amount());
			System.out.println(c.isStatus());
			System.out.println(c.isConfirmOrder());
			System.out.println("=========================================");
		}
	}
}
