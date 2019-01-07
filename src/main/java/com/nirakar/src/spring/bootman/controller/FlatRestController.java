package com.nirakar.src.spring.bootman.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nirakar.springjdbc.dao.FlatDAO;
import com.nirakar.springjdbc.model.Flat;

@RestController
public class FlatRestController {

	@Autowired
	private FlatDAO flatimpl;

	@GetMapping("/getAll-Flats")
	public List<Flat> getAllFlatName() {
		return flatimpl.getAllFlatName();
	}

}
