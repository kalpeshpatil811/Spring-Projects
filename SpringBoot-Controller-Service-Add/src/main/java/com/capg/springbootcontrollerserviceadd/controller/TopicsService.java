package com.capg.springbootcontrollerserviceadd.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicsService {
	public List<Topics> topics = Arrays.asList(new Topics("SpringBoot", "Spring MVC", "Spring"),
			new Topics("J2SE Technologies", "JDBC", "JAVA"), new Topics("JPA", "Hibernate", "ORM"));

	List<Topics> myTopics = new ArrayList<Topics>();

	public List<Topics> getAllMyTopics() {
		return topics;
	}

	public void addTopic(Topics topics) {
		myTopics.add(topics);
	}
}
