package com.nirakar.src.springboot.restservice.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nirakar.src.springboot.exception.IPLMatchException;
import com.nirakar.src.springboot.model.IPLMatchDetail;
import com.nirakar.src.springboot.restservice.IPLService;
import com.nirakar.src.springboot.restservice.util.CsvParser;

@RestController

@RequestMapping(value = "/rest/ipl", method = RequestMethod.GET)
public class IPLServiceImpl implements IPLService {

	@Autowired
	private CsvParser csvParser;

	@RequestMapping("/greet")
	public String greet() {
		return "Hello";
	}

	@Override
	@GetMapping(value = "/getDetailsById/{id}")
	public IPLMatchDetail getDetailsById(@PathVariable Integer id) {
		// http://localhost:8182/rest/ipl/getDetailsById/126
		IPLMatchDetail matchDetailById = csvParser.getMatchDetailById(id);

		if (matchDetailById == null)
			throw new IPLMatchException("ID " + id);

		return matchDetailById;
	}

	@Override
	@RequestMapping(value = "/getTeamsForASeasson/{year}", method = RequestMethod.GET)
	public List<String> getAllTeamNamesparticipatedInThatYear(@PathVariable String year) {
		return csvParser.getAllTeamNamesForASeason(year);
	}

	@Override
	public Set<String> getCitiesForSeasson(String year) {

		return null;
	}

	@Override
	public List<String> getAllDetialsForSeasson(String year) {
		return null;
	}

	@Override
	@GetMapping(value = "/updateResult/{id}")
	public boolean updateResult(@PathVariable Integer id) {
		// http://localhost:8182/rest/ipl/updateResult/126
		IPLMatchDetail matchDetailById = csvParser.getMatchDetailById(id);
		if (matchDetailById.getResult().equalsIgnoreCase("tie"))
			matchDetailById.setResult("normal");

		return csvParser.save(matchDetailById);
	}

}
