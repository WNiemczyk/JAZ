package com.example.jsfdemo.domain;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;



public class Director {

	private String name = "unknown";
	private String surname;
	private String countryOfBirth;
	private Date dateOfBirth;
	
	public Director() {

	}

	public Director(String n, String s, String cob, Date dateOfBirth) {

		this.name = n;
		this.surname = s;
		this.countryOfBirth = cob;
		this.dateOfBirth = dateOfBirth;
	}

	
	/*
	public List<Director> init() {

		List<Director> directors = new ArrayList<Director>();
		directors.add(new Director("Roman", "Polański", "France", 1933));
		directors.add(new Director("Martin", "Scorsese", "USA", 1942));
		directors.add(new Director("Guy", "Ritchie", "Great Britain", 1968));
		directors.add(new Director("Susanne", "Bier", "Denmark", 1960));
		directors.add(new Director("Alex", "de la Iglesia", "Spain", 1965));
		directors.add(new Director("Ethan", "Coen", "USA", 1957));
		directors.add(new Director("Joel", "Coen", "USA", 1954));

		return directors;
	}

	public String toString() {

		String director;

		director = name + " " + surname + " " + countryOfBirth + " "
				+ yearOfBirth;

		return director;
	}
	 */
	
	@Size(min = 2, max = 20)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//@DirectorSurnameValidator
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Size(min = 2, max = 20)
	public String getCountryOfBirth() {
		return countryOfBirth;
	}

	public void setCountryOfBirth(String countryOfBirth) {
		this.countryOfBirth = countryOfBirth;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
}

