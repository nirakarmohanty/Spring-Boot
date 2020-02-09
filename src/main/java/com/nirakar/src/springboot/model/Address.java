package com.nirakar.src.springboot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Address {
	@JsonIgnore
	private String apartment;
	private String area;
	private String city;

	public String getApartment() {
		return apartment;
	}

	public void setApartment(String apartment) {
		this.apartment = apartment;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address(String apartment, String area, String city) {
		super();
		this.apartment = apartment;
		this.area = area;
		this.city = city;
	}

}
