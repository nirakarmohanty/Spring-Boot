package com.nirakar.src.springboot.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages={"com.nirakar.src.springboot.restservice"})
@EnableAutoConfiguration
@RestController
@ImportResource("classpath:Spring-application-context.xml")
@EnableJpaRepositories("com.nirakar.src.springboot")
@ComponentScan
@EntityScan("com.nirakar.src.springboot")
public class SpringMain {
	public static void main(String[] args) {
		SpringApplication.run(SpringMain.class, args);
	}

	@RequestMapping("/hello")
	String hello() {
		return "[Spring Main ]Hello Boot!!!!";
	}
	
}
