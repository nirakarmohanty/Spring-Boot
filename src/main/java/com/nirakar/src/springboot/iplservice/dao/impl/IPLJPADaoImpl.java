package com.nirakar.src.springboot.iplservice.dao.impl;

import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nirakar.src.springboot.iplservice.dao.IPLJPADao;
import com.nirakar.src.springboot.model.IPLMatchDetail;
import com.nirakar.src.springboot.restservice.IPLJPAResource;

@Component("iplJpadao")
public class IPLJPADaoImpl implements IPLJPADao {

	@Autowired
	IPLJPAResource iPLJPAResource;
	
	
	@Override
	public List<IPLMatchDetail> getAllMatches() {
		return iPLJPAResource.findAll();
	}

	@Override
	public IPLMatchDetail getMatchDetailById(int id) {
		List<IPLMatchDetail> allMatches = iPLJPAResource.findAll();
		System.out.println(allMatches.size());
		return allMatches.stream().filter(predicate->
			predicate.getId()==id
		).findAny().orElse(null);
	}

}
