package com.capg.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootControllerApplication.class, args);
		System.out.println("Spring boot server started...");
	}

}
