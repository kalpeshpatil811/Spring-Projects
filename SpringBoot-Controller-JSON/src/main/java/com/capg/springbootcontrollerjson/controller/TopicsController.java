package com.capg.springbootcontrollerjson.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {

	@RequestMapping("/mycontroller")
	public String display() {
		return "Controller Topics";
	}

	@RequestMapping("/topics")
	public List<Topics> getAllTopics() {
		return Arrays.asList(new Topics("Spring Boot", "Spring MVC", "Spring"),
				new Topics("J2SE Technologies", "JDBC", "Java"), new Topics("JPA", "Hibernate", "ORM"));
	}
}
