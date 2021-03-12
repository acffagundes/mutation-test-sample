package com.mutation.pitest.sample.nonrecursive;

import java.io.Serializable;

public class AddressType implements Serializable {

	
	private static final long serialVersionUID = -1106070313899405145L;
	
	private String street;
	private Integer number;
	private String city;
	private String country;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
