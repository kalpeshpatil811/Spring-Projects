package com.capg.springbootcontrollerserviceaddfind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {

	@Autowired
	TopicsService topicsService;

	@RequestMapping("/myController")
	public String display() {
		return "Mycontroller";
	}

	@RequestMapping("/topics")
	public List<Topics> getAllTopics() {
		return topicsService.getAllMyTopics();
	}

	// @PathVariable is used to extract data right form the URI(values from URI
	// itself)
	@RequestMapping("/topics/{id}")
	public Topics getTopic(@PathVariable String id) {
		return topicsService.getTopic(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopic(@RequestBody Topics topic) {
		System.out.println(topic.toString());
		topicsService.addTopic(topic);
	}

}