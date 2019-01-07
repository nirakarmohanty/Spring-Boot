package com.nirakar.springjdbc.dao;

import java.util.List;

import com.nirakar.springjdbc.model.Login;

public interface AuthenticateDAO {

	public List<Login> findAll();

	public Login getResident(String username);

	public boolean isValidUser(String username);

	public boolean updatePassword(String username, String password);
	
	public boolean insertNewUser(Login loginDetails);

}
