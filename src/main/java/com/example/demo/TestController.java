package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Autowired
	TestService testService;
	
	@RequestMapping("/")
	public String testTransaction() {
		
		testService.testTransaction1();
		
		return "helloworld!";
	}
}