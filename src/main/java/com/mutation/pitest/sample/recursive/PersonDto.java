package com.mutation.pitest.sample.recursive;

import java.io.Serializable;

public class PersonDto implements Serializable {

	private static final long serialVersionUID = 27453666179120630L;

	private String firstName;
	private String lastName;
	private Integer age;
	private AddressDto address;

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

	public AddressDto getAddress() {
		return address;
	}

	public void setAddress(AddressDto address) {
		this.address = address;
	}

}
