package com.nirakar.src.springboot.restservice;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.nirakar.src.springboot.model.IPLMatchDetail;

@Repository("iPLJPAResource")
@Component
public interface IPLJPAResource extends JpaRepository<IPLMatchDetail, Integer>{
	
	//@Query("Select u from IPLMATCH_DETAIL u")
	//public List<IPLMatchDetail> findBySeason(String season);

}
