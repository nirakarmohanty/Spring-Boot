package com.nirakar.src.springboot.model;

import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("PostalAddessBean")
public class PostalAddress {

	private String postofficeName;
	private String areaName;
	private int zipcode;

	public PostalAddress(String postofficeName, String areaName, int zipcode) {
		super();
		this.postofficeName = postofficeName;
		this.areaName = areaName;
		this.zipcode = zipcode;
	}

	public String getPostofficeName() {
		return postofficeName;
	}

	public void setPostofficeName(String postofficeName) {
		this.postofficeName = postofficeName;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

}
