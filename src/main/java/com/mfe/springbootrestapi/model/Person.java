package com.mfe.springbootrestapi.model;

import jakarta.persistence.*;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Table;
//import jakarta.persistence.Id;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Column;


@Entity
@Table(name = "people")
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "femail_ID")
	private String emailID;
	 
	 // default constructor
	 public Person() {
		 
	 }

 	// parameter constructo
	public Person(String firstName, String lastName, String emailID) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailID = emailID;
	}
	
	// accessor and mutator methods
	public long getId() {
		return id;
	}	
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
 
}
