package com.javafsd.springazurejavfsd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureJavfsdApplication {

	@GetMapping("/hello")
	public String message() {
		return " Hello Welcome to Azure !";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAzureJavfsdApplication.class, args);
	}

}
