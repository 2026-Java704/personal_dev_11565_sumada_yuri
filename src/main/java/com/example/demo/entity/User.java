package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String password;
	//	private Integer age;
	//	private Integer gender;
	//	private Double weight;

	public User() {
	}

	public User(Integer id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
		//		this.age = age;
		//		this.gender = gender;
		//		this.weight = weight;
	}

	public User(String name, String password) {
		this.name = name;
		this.password = password;
	}

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	//
	//	public Integer getAge() {
	//		return age;
	//	}
	//
	//	public void setAge(Integer age) {
	//		this.age = age;
	//	}
	//
	//	public Integer getGender() {
	//		return gender;
	//	}
	//
	//	public void setGender(Integer gender) {
	//		this.gender = gender;
	//	}
	//
	//	public Double getWeight() {
	//		return weight;
	//	}
	//
	//	public void setWeight(Double weight) {
	//		this.weight = weight;
	//	}

}
