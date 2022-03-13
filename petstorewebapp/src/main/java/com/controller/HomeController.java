package com.controller;

import java.util.ArrayList;
import java.util.List;
import com.model.Pet;
import com.model.Customer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/")
	public ModelAndView getIndex() {
		ModelAndView mav = new ModelAndView("/index");
		return mav;
	}

	@RequestMapping("/petstorehome")
	public ModelAndView getPetStoreHome() {
		List<Pet> petList = new ArrayList<Pet>();
		petList.add(new Pet("Jack", "Dog", 2));
		petList.add(new Pet("Kiwi", "Cat", 2));
		petList.add(new Pet("Tommy", "Dog", 1));
		petList.add(new Pet("Erric", "Parrot", 3));
		petList.add(new Pet("Tomo", "Dog", 4));
		petList.add(new Pet("Bosco", "Cat", 1));
		ModelAndView mav = new ModelAndView("/PetStoreHome");
		mav.addObject("petList", petList);
		return mav;
	}

	@RequestMapping("/addpet")
	public ModelAndView getAddPet() {
		ModelAndView mav = new ModelAndView("/AddPet");
		return mav;
	}

	@ModelAttribute("pet")
	public Pet getPet() {
		Pet pet = new Pet();
		pet.setPetName("No Name");
		pet.setType("No Type");
		pet.setAge(0);
		return pet;
	}

	/*
	 * @RequestMapping(value = "/petsuccess", method = RequestMethod.POST) public
	 * ModelAndView addPetDetails(@RequestParam("petName") String
	 * petName, @RequestParam("type") String type,
	 * 
	 * @RequestParam("age") int age) { Pet newpet = new Pet(petName, type, age);
	 * ModelAndView mav = new ModelAndView("/PetSuccess"); mav.addObject("newpet",
	 * newpet); return mav; }
	 */

	@RequestMapping(value = "/petsuccess", method = RequestMethod.POST)
	public ModelAndView addPetDetails(@ModelAttribute("pet") Pet pet) {
		ModelAndView mav = new ModelAndView("/PetSuccess");
		mav.addObject("newpet", pet);
		return mav;
	}

	@RequestMapping("/addcustomer")
	public ModelAndView getAddCustomer() {
		ModelAndView mav = new ModelAndView("/AddCustomer");
		return mav;
	}

	@RequestMapping(value = "/customersuccess", method = RequestMethod.POST)
	public ModelAndView addCustomerDetails(@RequestParam("customerName") String customerName,
			@RequestParam("address") String address) {
		Customer newcustomer = new Customer(customerName, address);
		ModelAndView mav = new ModelAndView("/CustomerSuccess");
		mav.addObject("newcustomer", newcustomer);
		return mav;
	}
}
