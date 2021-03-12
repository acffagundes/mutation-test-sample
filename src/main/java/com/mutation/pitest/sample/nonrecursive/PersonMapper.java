package com.mutation.pitest.sample.nonrecursive;

public final class PersonMapper {
	
	private PersonMapper() {}
	
	public static PersonDto mapToDto(PersonType personType) {
		
		PersonDto personDto = new PersonDto();
		personDto.setFirstName(personType.getFirstName());
		personDto.setLastName(personType.getLastName());
		personDto.setAge(personType.getAge());
		
		AddressDto addressDto = new AddressDto();
		addressDto.setCity(personType.getAddress().getCity());
		addressDto.setCountry(personType.getAddress().getCountry());
		addressDto.setNumber(personType.getAddress().getNumber());
		addressDto.setStreet(personType.getAddress().getStreet());
		
		personDto.setAddress(addressDto);
		
		return personDto;
		
	}

}
