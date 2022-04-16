package com.capg.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello, Welcome to my SpringBoot Application";
	}

	@RequestMapping("/myname")
	public String sayMyName() {
		return "My Name: Kalpesh";
	}
}
