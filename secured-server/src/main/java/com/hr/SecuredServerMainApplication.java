package com.hr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class SecuredServerMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecuredServerMainApplication.class, args);
	}
	
	@GetMapping
	public String hello()
	{
		return "Welcome to the secured server !";
	}

}
