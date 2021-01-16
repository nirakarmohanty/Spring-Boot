package com.nirakar.src.springboot.restservice;

import java.util.List;
import java.util.Set;

import com.nirakar.src.springboot.model.IPLMatchDetail;

public interface IPLService {

	IPLMatchDetail getDetailsById(Integer id);
	List<String> getAllTeamNamesparticipatedInThatYear(String year);
	Set<String> getCitiesForSeasson(String year);
	List<String> getAllDetialsForSeasson(String year);	
	//Update Result from Tie To Normal
	boolean updateResult(Integer id);
	
	
	
}
