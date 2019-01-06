package com.nirakar.src.spring.bootman.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nirakar.springjdbc.dao.AuthenticateDAO;
import com.nirakar.springjdbc.model.Resident;

@RestController
public class AuthenticateRestController {
	@Autowired
	private AuthenticateDAO authenticateImpl;

	@GetMapping("/getAllUsers")
	public List<Resident> getAllUsers(){
		
		return authenticateImpl.findAll();
	}
}
