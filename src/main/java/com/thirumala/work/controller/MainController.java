package com.thirumala.work.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping
	public String welcome() {
		return "Welcome to the Kubernetes Deployment Test application...";
	}

	@GetMapping("/hi")
	public String sayHi() {
		return "Hi from the application";
	}
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello from the application";
	}
	
	@GetMapping("/bye")
	public String sayBye() {
		return "Bye from the application";
	}
}
