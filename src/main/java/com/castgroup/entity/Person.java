package com.castgroup.entity;

import javax.persistence.*;
import java.io.Serializable;
/**
 * Person entity is used to send and receive from DB Person informations.
 */
@Entity
public class Person implements Serializable{

    private static final long serialVersionUID = 0x62A6DA99AABDA8A8L;
	
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer id;
	
    @Column
    private String name;
    
    @Column
    private String street;
    
    @Column
    private String number;
    
    @Column
    private String neighborhood;
    
    @Column
    private String city;
    
    @Column
    private String state;
    
    @Column
    private String cellphone;
    
    @Column
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


    public Person() {
    }

    public Person(String name, String street, String number, String neighborhood,
    		String city, String state, String cellphone, String phone) {
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
