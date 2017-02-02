package com.codingKnowledge.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String helloController() {
		return "Hello Spring Boot";
	}
}
