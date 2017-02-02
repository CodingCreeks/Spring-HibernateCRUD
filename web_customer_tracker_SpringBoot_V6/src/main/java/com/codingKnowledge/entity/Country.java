package com.codingKnowledge.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String country;

	@OneToOne(mappedBy = "country", cascade = CascadeType.ALL, targetEntity = Address.class)
	private Address address;

	public Country() {
	}

	public Country(Address address) {
		this.address = address;
	}

	public Country(int id, String country, Address address) {
		this.id = id;
		this.country = country;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return country;
	}

}
