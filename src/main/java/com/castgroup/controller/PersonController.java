package com.castgroup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.castgroup.dto.PersonDto;
import com.castgroup.service.PersonService;
import com.castgroup.utils.Constants;

/**
 * PersonController is a class that handle all the requests.
 */
@RequestMapping("/rest")
@RestController
public class PersonController {
	@Autowired
	PersonService personService;

	@RequestMapping(Constants.GET_PERSON_BY_ID)
	public PersonDto getUserById(@PathVariable Integer id) {
		return personService.getPersonById(id);
	}
	
	@RequestMapping(Constants.GET_ALL_PERSONS)
	public List<PersonDto> getAllPersons() {
		return personService.getAllPersons();
	}
	
	@RequestMapping(value= Constants.SAVE_PERSON, method= RequestMethod.POST)
	public void savePerson(@RequestBody PersonDto personDto) {		
		personService.savePerson(personDto);
	}
	
	@RequestMapping(value= Constants.REMOVE_PERSON, method= RequestMethod.DELETE)
	public void deletePersonById(@PathVariable Integer id) {
		personService.deletePersonById(id);
	}
}
