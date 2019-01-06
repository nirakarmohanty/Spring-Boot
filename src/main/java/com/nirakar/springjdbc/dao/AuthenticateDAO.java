package com.nirakar.springjdbc.dao;

import java.util.List;

import com.nirakar.springjdbc.model.Resident;

public interface AuthenticateDAO {

	public List<Resident> findAll();
}
