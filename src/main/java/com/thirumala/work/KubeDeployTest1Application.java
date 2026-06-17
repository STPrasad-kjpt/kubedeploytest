package com.thirumala.work;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KubeDeployTest1Application {
	
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

	public static void main(String[] args) {
		SpringApplication.run(KubeDeployTest1Application.class, args);
	}

}
