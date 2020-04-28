package com.vijender.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}

	@GetMapping(value="/msg")
	public String getMessage(){
		return "Hello World";
	}

	@GetMapping(value="/")
	public String getHealthCheck(){
		return "Passed";
	}

	@PostMapping(value="/msg")
	public String printMessage(@RequestParam String userMsg){
		return "The Message You Send Is : " +userMsg;

	}

}
