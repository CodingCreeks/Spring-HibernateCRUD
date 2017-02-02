package com.codingKnowledge.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {

	@RequestMapping("/hello")
	public String hello(){
		return "Welcome to Spring Boot Application";
	}
}
