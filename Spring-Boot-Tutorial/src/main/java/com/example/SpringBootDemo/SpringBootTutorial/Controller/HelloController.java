package com.example.SpringBootDemo.SpringBootTutorial.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
   
	
	@GetMapping("/")
	public String hello() {
		return "welcome to the Spring Boot Camp  !!!lets ";
	}
	
}
