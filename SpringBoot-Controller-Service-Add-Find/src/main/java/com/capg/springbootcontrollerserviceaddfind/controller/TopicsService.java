package com.capg.springbootcontrollerserviceaddfind.controller;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class TopicsService {

	public List<Topics> topics = Arrays.asList(new Topics("SpringBoot", "Spring MVC", "Spring"),
			new Topics("J2SE Technologies", "JDBC", "JAVA"), new Topics("JPA", "Hibernate", "ORM"));

	List<Topics> myTopics = new ArrayList<Topics>(topics);

	public List<Topics> getAllMyTopics() {
		return myTopics;
	}

	public Topics getTopic(String id) {
		return (Topics) topics.stream().filter(t -> ((Topics) t).getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topics topic) {
		myTopics.add(topic);
	}

}
