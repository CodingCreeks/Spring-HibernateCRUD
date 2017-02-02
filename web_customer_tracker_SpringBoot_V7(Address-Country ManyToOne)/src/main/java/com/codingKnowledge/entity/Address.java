package com.codingKnowledge.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String street;
	private String city;
	private String state;
	private long pincode;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "address")
	private Customer customer;

	@ManyToOne(cascade = CascadeType.ALL, targetEntity = Country.class)
	@PrimaryKeyJoinColumn
	private Country country;

	public Address() {
	}

	public Address(Customer customer, Country country) {
		this.customer = customer;
		this.country = country;
	}

	public Address(String street, String city, String state, long pincode, Customer customer, Country country) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.customer = customer;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", pincode="
				+ pincode + "]";
	}

}
