package com.simpleproject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=(GenerationType.IDENTITY))
	private Long Id;
	private String name;
	private String email;
	private int age;
	private String gender;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Student(String name, String email, int age, String gender) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.gender = gender;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
