package com.nirakar.src.springboot.restservice.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nirakar.src.springboot.model.Greet;
import com.nirakar.src.springboot.restservice.GreetService;

@Controller
public class GreetController implements GreetService {
	private static final String welcomemsg = "Hello Mr. %s!";
	// http://localhost:8182/greet/user?name=Naman
    //@GetMapping("/greet/user")
    @ResponseBody
    public Greet greet(@RequestParam(name="name", required=false, defaultValue="Java Fan") String name) {

        return new Greet(String.format(welcomemsg, name));

    }

}
