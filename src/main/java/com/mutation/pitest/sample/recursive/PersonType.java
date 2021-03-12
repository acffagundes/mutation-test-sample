package com.mutation.pitest.sample.recursive;

import java.io.Serializable;

public class PersonType implements Serializable {


	private static final long serialVersionUID = -857618454033239808L;
	
	private String firstName;
	private String lastName;
	private Integer age;
	private AddressType address;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public AddressType getAddress() {
		return address;
	}

	public void setAddress(AddressType address) {
		this.address = address;
	}

}
