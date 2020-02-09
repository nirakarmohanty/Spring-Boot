package com.nirakar.src.springboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Id
	private int id;
	private String firstname;
	private String lastname;
}