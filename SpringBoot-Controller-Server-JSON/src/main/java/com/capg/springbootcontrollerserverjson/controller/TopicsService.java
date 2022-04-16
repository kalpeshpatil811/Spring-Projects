package com.capg.springbootcontrollerserverjson.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicsService {
	public List<Topics> topics = Arrays.asList(new Topics("SpringBoot", "Spring MVC", "Spring"),
			new Topics("J2SE Technologies", "JDBC", "JAVA"), new Topics("JPA", "Hibernate", "ORM"));

	public List<Topics> getAllMyTopics() {
		return topics;
	}
}
