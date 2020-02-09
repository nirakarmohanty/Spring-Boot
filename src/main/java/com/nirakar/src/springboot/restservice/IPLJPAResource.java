package com.nirakar.src.springboot.restservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.nirakar.src.springboot.model.IPLMatchDetail;

@Repository("iPLJPAResource")
@Component
public interface IPLJPAResource extends JpaRepository<IPLMatchDetail, Integer>{

}
