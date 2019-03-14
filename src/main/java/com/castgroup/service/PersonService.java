package com.castgroup.service;

import java.util.List;

import com.castgroup.dto.PersonDto;

/**
 * PersonService contains all the methods that needs to be implemented to manipulate Person informations.
 */
public interface PersonService {
	List<PersonDto> getAllPersons();
	PersonDto getPersonById(Integer id);
    void savePerson(PersonDto personDto);
    void deletePersonById(Integer id);    
}
