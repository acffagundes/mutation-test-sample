package com.mutation.pitest.sample.recursive;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;


public class PersonMapperTest {
	

	private static final Integer AGE = 21;
	private static final String FIRST_MANE = "First Name";
	private static final String LAST_NAME = "Last Name";
	private static final String CITY = "City";
	private static final String COUNTRY = "Country";
	private static final Integer NUMBER = 5;
	private static final String STREET = "Street";

	@Test
	public void shouldReturnVLocLegalEntityWhenGivenLegalEntityBusinessDtoNape() {
		// Given
		PersonType personType = createPersonType();
		PersonDto expectedPerson = createExpectedPersonDto();
		

		// When
		PersonDto personDto = PersonMapper.mapToDto(personType);

		// Then
		assertThat(personDto).isNotNull().isEqualToComparingFieldByFieldRecursively(expectedPerson);

	}
	
	
	private PersonType createPersonType() {
		PersonType personType = new PersonType();
		personType.setFirstName(FIRST_MANE);
		personType.setLastName(LAST_NAME);
		personType.setAge(AGE);
		
		AddressType addressType = new AddressType();
		addressType.setCity(CITY);
		addressType.setCountry(COUNTRY);
		addressType.setNumber(NUMBER);
		addressType.setStreet(STREET);
		
		personType.setAddress(addressType);
		
		return personType;
		
	}
	
	private PersonDto createExpectedPersonDto() {
		PersonDto personDto = new PersonDto();
		personDto.setFirstName(FIRST_MANE);
		personDto.setLastName(LAST_NAME);
		personDto.setAge(AGE);
		
		AddressDto addressDto = new AddressDto();
		addressDto.setCity(CITY);
		addressDto.setCountry(COUNTRY);
		addressDto.setNumber(NUMBER);
		addressDto.setStreet(STREET);
		
		personDto.setAddress(addressDto);
		
		return personDto;
		
	}

}
