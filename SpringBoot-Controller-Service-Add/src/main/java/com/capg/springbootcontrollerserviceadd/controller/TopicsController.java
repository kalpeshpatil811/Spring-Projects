package com.capg.springbootcontrollerserviceadd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {
	@Autowired
	TopicsService ts;

	@RequestMapping("/mycontroller")
	public String display() {
		return "Controller Topics";
	}

	@RequestMapping("/topics")
	public List<Topics> getAllTopics() {
		return ts.getAllMyTopics();
	}

	@RequestMapping(value = "/topics", method = RequestMethod.POST)
	public void addTopic(@RequestBody Topics topic) {
		ts.addTopic(topic);
	}
}
