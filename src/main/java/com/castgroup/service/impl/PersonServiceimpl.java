package com.castgroup.service.impl;

import com.castgroup.dto.PersonDto;
import com.castgroup.repository.PersonRepository;
import com.castgroup.service.PersonService;
import com.castgroup.translator.PersonTranslator;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implements {@link PersonService}
 */
@Service
public class PersonServiceimpl implements PersonService {
	@Autowired
	PersonRepository personRepository;

	/**
	 * Search the Person by id and return the PersonDto entity. 
	 * @id the id of the person
	 * @return the Person from DB.
	 */
	@Override
	public PersonDto getPersonById(Integer id) {
		return PersonTranslator.entityToDto(personRepository.getOne(id));
	}

	/**
	 * Save the Person information.
	 * @personDto the person information.
	 */
	@Override
	public void savePerson(PersonDto personDto) {
		personRepository.save(PersonTranslator.dtoToEntity(personDto));
	}

	/**
	 * Returns all the Person informations that we have on DB.
	 * @return all the persons from DB.
	 */
	@Override
	public List<PersonDto> getAllPersons() {
		return personRepository.findAll().stream().map(PersonTranslator::entityToDto).collect(Collectors.toList());
	}
	
	/**
	 * Delete a person from DB.
	 * @id the id of the person to be deleted.
	 */
	@Override
	public void deletePersonById(Integer id) {
		personRepository.deleteById(id);
	}	
}
