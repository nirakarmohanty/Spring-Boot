package com.nirakar.src.spring.bootman.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nirakar.springjdbc.dao.AuthenticateDAO;
import com.nirakar.springjdbc.model.Login;

@RestController
public class AuthenticateRestController {

	@Autowired
	private AuthenticateDAO authenticateImpl;

	@GetMapping("/getAllUsers")
	public List<Login> getAllUsers() {
		return authenticateImpl.findAll();
	}

	@GetMapping("/getUser/{username}")
	@ResponseBody
	public Login getUser(@PathVariable("username") String username) {
		return authenticateImpl.getResident(username);
	}

	@GetMapping("/resetPassword/{username}/{password}")
	@ResponseBody
	public boolean resetPassword(@PathVariable String username,
			@PathVariable String password) {
		return authenticateImpl.updatePassword(username, password);
	}

	@GetMapping("/authenticateUser/{username}")
	@ResponseBody
	public boolean authenticateUser(@PathVariable String username) {
		return authenticateImpl.isValidUser(username);
	}

	@GetMapping("/insertNewUser/{username}/{password}")
	@ResponseBody
	public boolean insertNewUser(@PathVariable String username,
			@PathVariable String password) {
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		Date dateobj = new Date();
		Login login = new Login();
		login.setUsername(username);
		login.setPassword(password);
		login.setDate(dateobj);
		return authenticateImpl.insertNewUser(login);
	}
}
