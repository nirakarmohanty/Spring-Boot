package com.nirakar.src.springboot.restservice;

import java.util.List;

import com.nirakar.src.springboot.model.IPLMatchDetail;

public interface IPLJPAService {

	List<IPLMatchDetail> getAllMatches();

	IPLMatchDetail getMatchDetailById(Integer id);

	List<IPLMatchDetail> findDuckworthLewisMatchDetails();
	
	List<IPLMatchDetail> findBySeason(String season);
	
}
