package com.castgroup.dto;

import org.junit.Test;
import org.junit.Before;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
/**
 * Unit Test for {@link PersonDto}
 */
public class PersonDtoTest {
	
	private static Integer ID = 1;
	private static String NAME = "name";
    private static String STREET = "street";
    private static String NUMBER = "number";
    private static String NEIGHBORHOOD = "neighborhood";
    private static String CITY = "city";
    private static String STATE = "state";
    private static String CELLPHONE = "cellphone";
    private static String PHONE = "phone";
	
	public PersonDto personDto = new PersonDto();
	
	@Before
	public void setup(){
		personDto = new PersonDto(ID, NAME, STREET, NUMBER, NEIGHBORHOOD, CITY, STATE, CELLPHONE, PHONE);
	}
	
    @Test
	public void getId_shouldReturnTheId(){
    	Integer id = personDto.getId();
    	assertThat(id, equalTo(ID));
    }

    @Test
	public void getName_shouldReturnTheName(){
    	String name = personDto.getName();
    	assertThat(name, equalTo(NAME));

    }

    @Test
	public void getStreet_shouldReturnTheStreet(){
    	String street= personDto.getStreet();
    	assertThat(street, equalTo(STREET));

    }

    @Test
	public void getNumber_shouldReturnTheNumber(){
    	String number= personDto.getNumber();
    	assertThat(number, equalTo(NUMBER));

    }

    @Test
	public void getNeighborhood_shouldReturnTheNeighborhood(){
    	String neighborhood= personDto.getNeighborhood();
    	assertThat(neighborhood, equalTo(NEIGHBORHOOD));

    }

    @Test
	public void getCity_shouldReturnTheCity(){
    	String city= personDto.getCity();
    	assertThat(city, equalTo(CITY));
    }

    @Test
	public void getState_shouldReturnTheState(){
    	String state= personDto.getState();
    	assertThat(state, equalTo(STATE));
    }

    @Test
	public void getCellphone_shouldReturnTheCellphone(){
    	String cellphone= personDto.getCellphone();
    	assertThat(cellphone, equalTo(CELLPHONE));
    }

    @Test
	public void getPhone_shouldReturnThePhone(){
    	String phone = personDto.getPhone();
    	assertThat(phone, equalTo(PHONE));
    }
    
    @Test
	public void setId_shouldSetTheId(){
    	PersonDto personDtoTest = new PersonDto();
    	personDtoTest.setId(ID);
    	assertThat(personDtoTest.getId(), equalTo(ID));
    }

    @Test
	public void setName_shouldSetTheName(){
    	PersonDto personDtoTest = new PersonDto();
    	personDtoTest.setName(NAME);
    	assertThat(personDtoTest.getName(), equalTo(NAME));
    }

    @Test
	public void setStreet_shouldSetTheStreet(){
    	PersonDto personDtoTest = new PersonDto();
    	personDtoTest.setStreet(STREET);
		assertThat(personDtoTest.getStreet(), equalTo(STREET));    	 
    }

    @Test
	public void setNumber_shouldSetTheNumber(){
    	PersonDto personDtoTest = new PersonDto();
    	personDtoTest.setNumber(NUMBER);
    	assertThat(personDtoTest.getNumber(), equalTo(NUMBER));
    }

    @Test
	public void setNeighborhood_shouldSetTheNeighborhood(){
    	PersonDto personDtoTest = new PersonDto();
    	personDtoTest.setNeighborhood(NEIGHBORHOOD);
    	assertThat(personDtoTest.getNeighborhood(), equalTo(NEIGHBORHOOD));
    }

    @Test
	public void setCity_shouldSetTheCity(){
    	PersonDto personDtoTest = new PersonDto();
    	personDtoTest.setCity(CITY);
    	assertThat(personDtoTest.getCity(), equalTo(CITY));
    }

    @Test
	public void setState_shouldSetTheState(){
    	PersonDto personDtoTest = new PersonDto();
    	personDtoTest.setState(STATE);
    	assertThat(personDtoTest.getState(), equalTo(STATE));
    }

    @Test
	public void setCellphone_shouldSetTheCellphone(){
    	PersonDto personDtoTest = new PersonDto();
    	personDtoTest.setCellphone(CELLPHONE);
    	assertThat(personDtoTest.getCellphone(), equalTo(CELLPHONE));
    }

    @Test
	public void setPhone_shouldSetThePhone(){
    	PersonDto personDtoTest = new PersonDto();
    	personDtoTest.setPhone(PHONE);
		assertThat(personDtoTest.getPhone(), equalTo(PHONE));
    }
    
    @Test
    public void createPersonDto()
    {
    	PersonDto personDtoTest = new PersonDto(ID, NAME, STREET, NUMBER, NEIGHBORHOOD,
        		CITY, STATE, CELLPHONE, PHONE);
    	
    	assertThat(personDtoTest.getPhone(), equalTo(PHONE));
		assertThat(personDtoTest.getCellphone(), equalTo(CELLPHONE));
    	assertThat(personDtoTest.getState(), equalTo(STATE));
    	assertThat(personDtoTest.getId(), equalTo(ID));
    	assertThat(personDtoTest.getName(), equalTo(NAME));
		assertThat(personDtoTest.getStreet(), equalTo(STREET)); 
    	assertThat(personDtoTest.getNumber(), equalTo(NUMBER));
    	assertThat(personDtoTest.getNeighborhood(), equalTo(NEIGHBORHOOD));
    	assertThat(personDtoTest.getCity(), equalTo(CITY));
    }
	
}
