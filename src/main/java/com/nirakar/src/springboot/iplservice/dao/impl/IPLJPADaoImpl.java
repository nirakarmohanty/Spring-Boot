package com.nirakar.src.springboot.iplservice.dao.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nirakar.src.springboot.iplservice.dao.IPLJPADao;
import com.nirakar.src.springboot.model.IPLMatchDetail;
import com.nirakar.src.springboot.restservice.IPLJPAResource;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.Query;

@Component("iplJpadao")
public class IPLJPADaoImpl implements IPLJPADao {

	@Autowired
	IPLJPAResource iPLJPARepository;
	
	
	@Override
	public List<IPLMatchDetail> getAllMatches() {
		return iPLJPARepository.findAll();
	}

	@Override
	public IPLMatchDetail getMatchDetailById(int id) {
		List<IPLMatchDetail> allMatches = iPLJPARepository.findAll();
		System.out.println(allMatches.size());
		return allMatches.stream().filter(predicate->
			predicate.getId()==id
		).findAny().orElse(null);
	}

	@Override
	public List<IPLMatchDetail> getMatchDetailForDL() {
		 List<IPLMatchDetail> collectIPLMatchDetail = iPLJPARepository.findAll().stream().filter(predicate->
			predicate.getDl_applied().equalsIgnoreCase("1")
		).collect(Collectors.toList());
		return collectIPLMatchDetail!=null?collectIPLMatchDetail:null;
	}

	@Override
	
	public List<IPLMatchDetail> findBySeason(String season) {
		IPLMatchDetail iPLMatchDetail = new IPLMatchDetail();
		iPLMatchDetail.setSeason("2017");;
		
		Example<IPLMatchDetail> example= Example.of(iPLMatchDetail);
		List<IPLMatchDetail> findAll = iPLJPARepository.findAll(example);
		return findAll;
	}

}
