package com.castgroup.entity;

import org.junit.Test;
import org.junit.Before;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
/**
 * Unit Test for {@link Person}
 */
public class PersonTest {
	
	private static Integer ID = 1;
	private static String NAME = "name";
    private static String STREET = "street";
    private static String NUMBER = "number";
    private static String NEIGHBORHOOD = "neighborhood";
    private static String CITY = "city";
    private static String STATE = "state";
    private static String CELLPHONE = "cellphone";
    private static String PHONE = "phone";
	
	public Person person = new Person();
	
	@Before
	public void setup(){
		person = new Person( NAME, STREET, NUMBER, NEIGHBORHOOD, CITY, STATE, CELLPHONE, PHONE);
		person.setId(ID);
	}
	
    @Test
	public void getId_shouldReturnTheId(){
    	Integer id = person.getId();
    	assertThat(id, equalTo(ID));
    }

    @Test
	public void getName_shouldReturnTheName(){
    	String name = person.getName();
    	assertThat(name, equalTo(NAME));

    }

    @Test
	public void getStreet_shouldReturnTheStreet(){
    	String street= person.getStreet();
    	assertThat(street, equalTo(STREET));

    }

    @Test
	public void getNumber_shouldReturnTheNumber(){
    	String number= person.getNumber();
    	assertThat(number, equalTo(NUMBER));

    }

    @Test
	public void getNeighborhood_shouldReturnTheNeighborhood(){
    	String neighborhood= person.getNeighborhood();
    	assertThat(neighborhood, equalTo(NEIGHBORHOOD));

    }

    @Test
	public void getCity_shouldReturnTheCity(){
    	String city= person.getCity();
    	assertThat(city, equalTo(CITY));
    }

    @Test
	public void getState_shouldReturnTheState(){
    	String state= person.getState();
    	assertThat(state, equalTo(STATE));
    }

    @Test
	public void getCellphone_shouldReturnTheCellphone(){
    	String cellphone= person.getCellphone();
    	assertThat(cellphone, equalTo(CELLPHONE));
    }

    @Test
	public void getPhone_shouldReturnThePhone(){
    	String phone = person.getPhone();
    	assertThat(phone, equalTo(PHONE));
    }
    
    @Test
	public void setId_shouldSetTheId(){
    	Person personTest = new Person();
    	personTest.setId(ID);
    	assertThat(personTest.getId(), equalTo(ID));
    }

    @Test
	public void setName_shouldSetTheName(){
    	Person personTest = new Person();
    	personTest.setName(NAME);
    	assertThat(personTest.getName(), equalTo(NAME));
    }

    @Test
	public void setStreet_shouldSetTheStreet(){
    	Person personTest = new Person();
    	personTest.setStreet(STREET);
		assertThat(personTest.getStreet(), equalTo(STREET));    	 
    }

    @Test
	public void setNumber_shouldSetTheNumber(){
    	Person personTest = new Person();
    	personTest.setNumber(NUMBER);
    	assertThat(personTest.getNumber(), equalTo(NUMBER));
    }

    @Test
	public void setNeighborhood_shouldSetTheNeighborhood(){
    	Person personDto = new Person();
    	personDto.setNeighborhood(NEIGHBORHOOD);
    	assertThat(personDto.getNeighborhood(), equalTo(NEIGHBORHOOD));
    }

    @Test
	public void setCity_shouldSetTheCity(){
    	Person personTest = new Person();
    	personTest.setCity(CITY);
    	assertThat(personTest.getCity(), equalTo(CITY));
    }

    @Test
	public void setState_shouldSetTheState(){
    	Person personTest = new Person();
    	personTest.setState(STATE);
    	assertThat(personTest.getState(), equalTo(STATE));
    }

    @Test
	public void setCellphone_shouldSetTheCellphone(){
    	Person personTest = new Person();
    	personTest.setCellphone(CELLPHONE);
    	assertThat(personTest.getCellphone(), equalTo(CELLPHONE));
    }

    @Test
	public void setPhone_shouldSetThePhone(){
    	Person personTest = new Person();
    	personTest.setPhone(PHONE);
		assertThat(personTest.getPhone(), equalTo(PHONE));
    }
    
    @Test
    public void createPersonDto()
    {
    	Person personTest = new Person(NAME, STREET, NUMBER, NEIGHBORHOOD,
        		CITY, STATE, CELLPHONE, PHONE);
    	
    	assertThat(personTest.getPhone(), equalTo(PHONE));
		assertThat(personTest.getCellphone(), equalTo(CELLPHONE));
    	assertThat(personTest.getState(), equalTo(STATE));
    	assertThat(personTest.getName(), equalTo(NAME));
		assertThat(personTest.getStreet(), equalTo(STREET)); 
    	assertThat(personTest.getNumber(), equalTo(NUMBER));
    	assertThat(personTest.getNeighborhood(), equalTo(NEIGHBORHOOD));
    	assertThat(personTest.getCity(), equalTo(CITY));
    }
	
}
