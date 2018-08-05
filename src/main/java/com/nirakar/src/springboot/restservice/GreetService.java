package com.nirakar.src.springboot.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nirakar.src.springboot.model.Greet;
@RestController
public interface GreetService {
	@GetMapping("/greet/user")
    @ResponseBody
	Greet greet( String name) ;

}