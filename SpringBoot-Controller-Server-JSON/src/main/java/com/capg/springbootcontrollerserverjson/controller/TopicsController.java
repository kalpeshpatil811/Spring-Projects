package com.capg.springbootcontrollerserverjson.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
