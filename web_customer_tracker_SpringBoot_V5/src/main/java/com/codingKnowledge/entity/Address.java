package com.codingKnowledge.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	//@GeneratedValue(generator = "foreigngen")
	//@GenericGenerator(strategy = "foreign", name = "foreigngen", parameters = @Parameter(name = "property", value = "customer"))
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	private String street;
	private String city;
	private String state;
	private String country;
	private long pincode;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "address")
	private Customer customer;

	public Address() {
	}

	public Address(Customer customer) {
		this.customer = customer;
	}

	public Address(int id, String street, String city, String state, String country, long pincode) {
		this.id = id;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + ", state=" + state + ", country="
				+ country + ", pincode=" + pincode + "]";
	}

}
