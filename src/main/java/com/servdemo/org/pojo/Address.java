package com.servdemo.org.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Address {
	private Student student;
	
	private long id;

	
	private String street;

//	
//	private String city;
//
//	
//	private String country;
//	

	 @OneToOne( mappedBy = "address", 
			    cascade = CascadeType.ALL, fetch = FetchType.EAGER)
public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

public Address(){}

//	public Address( String city) {
//		
//		this.city = city;
//		
//	}
	@Id @GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

//	public String getCity() {
//		return city;
//	}
//
//	public void setCity(String city) {
//		this.city = city;
//	}
//
//	public String getCountry() {
//		return country;
//	}
//
//	public void setCountry(String country) {
//		this.country = country;
//	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street +"]";
				//+ ""
			//	+ ", city=" + city
		//		+ ", country=" + country + 
	}
	
	
}
