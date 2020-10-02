package com.gourisha.SpringBootStarter.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {

	private UUID id;
	private int age;
	private String firstName;
	private String lastName;
	private String course;

	public Student(@JsonProperty("id") UUID id, @JsonProperty("age") int age,
			@JsonProperty("firstName") String firstName, @JsonProperty("lastName") String lastName,
			@JsonProperty("course") String course) {
		super();
		this.id = id;
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

}
