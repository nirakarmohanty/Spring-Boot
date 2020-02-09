package com.nirakar.src.springboot.restservice.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.nirakar.src.springboot.model.Address;
import com.nirakar.src.springboot.model.PostalAddress;

@RestController
@RequestMapping(value = "/rest/filter", method = RequestMethod.GET)
public class FiltertionRestfulExample {

	@GetMapping("/getAddress")
	public Address getAddress() {
		return new Address("ShakthiFairmont", "Kadugodi", "Bangalore");
	}

	@GetMapping("/getAddress-list")
	public List<Address> getAddressList() {
		return Arrays.asList(new Address("ShakthiFairmont", "Kadugodi", "Bangalore"),
				new Address("Pubasahasn", "Uttara", "Bhubaneswar"));
	}

	/*
	 * ==========Dynamic Filter of response values=============
	 */

	@GetMapping("/getPostalAddress")
	public MappingJacksonValue getPostalAddress() {
		 PostalAddress postalAddress = new PostalAddress("Kadugodi", "Belathur", 560067);
		 
		 SimpleBeanPropertyFilter filter= SimpleBeanPropertyFilter.filterOutAllExcept("postofficeName","zipcode");
		 FilterProvider filterProvider = new SimpleFilterProvider().addFilter("PostalAddessBean", filter);
		 MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(postalAddress);
		 mappingJacksonValue.setFilters(filterProvider);
		 return mappingJacksonValue;
	}
}
