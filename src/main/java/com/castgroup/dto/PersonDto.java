package com.castgroup.dto;

/**
 * This class should be used to manipulate Person informations.
 */
public class PersonDto {
	private Integer id;
	private String name;
    private String street;
    private String number;
    private String neighborhood;
    private String city;
    private String state;
    private String cellphone;
    private String phone;
    
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


    public PersonDto() {
    }

    public PersonDto(Integer id, String name, String street, String number, String neighborhood,
    		String city, String state, String cellphone, String phone) {
    	this.id = id;
        this.name = name;
        this.street = street;
        this.number = number;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
        this.cellphone = cellphone;
        this.phone = phone;
    }
}
