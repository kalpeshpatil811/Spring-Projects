package petstoreproject.petstoreapp;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "springbeans.xml", "customerconfig.xml" }); // Creating context for XML files

		// Getting petStore bean from XML which will assign given value to class members
		PetStore petStore = context.getBean("petStore", PetStore.class);
		System.out.println(petStore.getStoreName());
		System.out.println(petStore.getAddress());
		System.out.println();

		Customer customer = context.getBean("customer", Customer.class);
		System.out.println(customer.getCustomerName());
		System.out.println(customer.getAddress());
		System.out.println(customer.getEmail());
		System.out.println(customer.getMobile());
		System.out.println();

		Pet pet = context.getBean("pet", Pet.class);
		System.out.println(pet.getPetName());
		System.out.println(pet.getAge());
		System.out.println(pet.getType());
		System.out.println();

		PetService petService = context.getBean("petService", PetService.class);
		System.out.println(petService.getPetStore().getStoreName()); // Using dependency on petStore
		System.out.println(petService.getPetStore().getAddress());
		System.out.println();

		PetHelpLineService petHelplineService = context.getBean("petHelplineService", PetHelpLineService.class);
		System.out.println(petHelplineService.getHelplineNumber()); // Using Factory method
		System.out.println();

		System.out.println(petService.getPetHelpLineService().getHelplineNumber()); // Using dependency on petService of
																					// petHelplineService
		System.out.println();

		PetFood petFood = context.getBean("petFood", PetFood.class);
		System.out.println(petFood.getFoodType());
		System.out.println(petFood.getCalories());
		System.out.println(petFood.getQuantity());
		System.out.println();

		CustomerService customerService = context.getBean("customerService", CustomerService.class);
		System.out.println(customerService.getServiceHelplineNumber()); // Using Factory method
		System.out.println(customerService.getCouncellorName()); // Using Factory method
		System.out.println();

		// Using dependency on customer bean of customerService bean
		System.out.println(customer.getCustomerService().getServiceHelplineNumber());
		System.out.println(customer.getCustomerService().getCouncellorName());
		System.out.println();

		// Getting list of pets
		List<Pet> petList = petService.getPetStore().getPetList(); // Getting list from petStore through dependency
		for (Pet p : petList) {
			System.out.println("=======================");
			System.out.println(p.getPetName());
			System.out.println(p.getAge());
			System.out.println(p.getType());
		}
		System.out.println();

		List<String> daysOpened = petService.getPetStore().getDaysOpened(); // Getting list from petStore through
																			// dependency
		System.out.println(daysOpened);
		System.out.println();

		Map<Integer, String> cityList = petService.getCityList(); // Getting cityList from petService
		System.out.println(cityList);
		for (Integer i : cityList.keySet()) {
			System.out.println(cityList.get(i));
		}
		System.out.println();

		List<RescueChamp> rescueChamp = petService.getRescueChamp(); // Getting cityList from petService
		for (RescueChamp rs : rescueChamp) {
			System.out.println("=======================");
			System.out.println(rs.getChampName());
			System.out.println(rs.getAnimalsRescued());
		}
	}
}