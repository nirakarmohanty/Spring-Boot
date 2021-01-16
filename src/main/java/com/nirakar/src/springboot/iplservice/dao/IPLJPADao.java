package com.nirakar.src.springboot.iplservice.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.nirakar.src.springboot.model.IPLMatchDetail;

@Repository
public interface IPLJPADao {
	
	List<IPLMatchDetail> getAllMatches();
	IPLMatchDetail getMatchDetailById(int id);
	List<IPLMatchDetail> getMatchDetailForDL();
	
	// Customize Query Methods
	List<IPLMatchDetail> findBySeason(String season);
}
