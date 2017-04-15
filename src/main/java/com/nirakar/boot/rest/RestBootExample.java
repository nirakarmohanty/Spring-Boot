package com.nirakar.boot.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EnableAutoConfiguration
@SpringBootApplication
//@SpringBootApplication - same as @Configuration @EnableAutoConfiguration @ComponentScan
public class RestBootExample {
	// http://localhost:8080
	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	// http://localhost:8080/hello
	@RequestMapping("/hello")
	String hello() {
		return "Hello Boot!!!!";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(RestBootExample.class, args);
	}

}