package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "exercise_records")
public class Exercize {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "user_id")
	private Integer userId;
	@Column(name = "burn_calorie")
	private Double burnCalorie;
	@Column(name = "event_id")
	private Integer eventId;
	private Date date;

	public Exercize(Integer id, Integer userId, Double burnCalorie, Integer eventId, Date date) {
		this.id = id;
		this.userId = userId;
		this.burnCalorie = burnCalorie;
		this.eventId = eventId;
		this.date = date;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Double getBurnCalorie() {
		return burnCalorie;
	}

	public void setBurnCalorie(Double burnCalorie) {
		this.burnCalorie = burnCalorie;
	}

	public Integer getEventId() {
		return eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}