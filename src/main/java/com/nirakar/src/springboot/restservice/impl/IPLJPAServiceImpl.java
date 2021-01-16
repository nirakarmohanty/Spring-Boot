package com.nirakar.src.springboot.restservice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nirakar.src.springboot.iplservice.dao.IPLJPADao;
import com.nirakar.src.springboot.model.IPLMatchDetail;
import com.nirakar.src.springboot.restservice.IPLJPAService;

@RestController
@RequestMapping(value = "/rest/ipl", method = RequestMethod.GET)
public class IPLJPAServiceImpl implements IPLJPAService {

	@Autowired
	private IPLJPADao iplJpadao;

	@Override
	@GetMapping(value = "/getAllMatches")
	public List<IPLMatchDetail> getAllMatches() {
		return iplJpadao.getAllMatches();
	}

	@Override
	@GetMapping(value = "/getMatchDetailById/{id}")
	public IPLMatchDetail getMatchDetailById(@PathVariable Integer id) {
		return iplJpadao.getMatchDetailById(id);
	}

	@Override
	@GetMapping(value = "/findDLMatchDetail")
	public List<IPLMatchDetail> findDuckworthLewisMatchDetails() {
		return iplJpadao.getMatchDetailForDL();

	}

	@Override
	@GetMapping(value = "/findBySeason/{season}")
	public List<IPLMatchDetail> findBySeason(@PathVariable String season) {
		return iplJpadao.findBySeason(season);
	}

}
