package com.rest.webservices.restful_web_services.users;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

//@JsonIgnoreProperties({"birth_date","user_id"})

@Entity(name = "user_details")
public class User {
//	@JsonProperty("user_id")
	@Id
	@GeneratedValue
	private Integer id;

	@JsonProperty("user_name")
	@Size(min = 2, message = "name must have atleast 2 characters.")
	private String name;

//	@JsonIgnore
	@JsonProperty("birth_date")
	@Past(message = "Date must be less than BOD date..")
	private LocalDate birthDate;

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

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	protected User() {

	}

	public User(Integer id, String name, LocalDate birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}

}
