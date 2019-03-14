package com.castgroup.translator;

import com.castgroup.dto.PersonDto;
import com.castgroup.entity.Person;
/**
 * Translate Person information
 */
public class PersonTranslator {
	/**
	 * Translate from PersonDto to Person
	 * @param personDto PersonDto entity.
	 * @return returns Person entity.
	 */
	public static Person dtoToEntity(PersonDto personDto) {
		Person person = new Person(personDto.getName(), personDto.getStreet(), personDto.getNumber(), personDto.getNeighborhood(),
				personDto.getCity(), personDto.getState(), personDto.getCellphone(), personDto.getPhone());
		person.setId(personDto.getId());
		return person;
	}

	/**
	 * Translate from Person to PersonDto
	 * @param person Person entity.
	 * @return returns PersonDto entity.
	 */
	public static PersonDto entityToDto(Person person) {		
		PersonDto personDto = new PersonDto(person.getId(), person.getName(), person.getStreet(), person.getNumber(), person.getNeighborhood(),
				person.getCity(), person.getState(), person.getCellphone(), person.getPhone());
		return personDto;
	}
}
