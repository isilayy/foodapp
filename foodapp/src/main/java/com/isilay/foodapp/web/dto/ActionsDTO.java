package com.isilay.foodapp.web.dto;

import java.io.Serializable;
import java.util.Date;

import com.isilay.foodapp.model.Persons;

public class ActionsDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private double price;
	private Persons person;
	private String eatDate;
	private Date eatDate2;
	
	public ActionsDTO(){
		
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Persons getPerson() {
		return person;
	}

	public void setPerson(Persons person) {
		this.person = person;
	}

	public String getEatDate() {
		return eatDate;
	}

	public void setEatDate(String eatDate) {
		this.eatDate = eatDate;
	}
	
	
	public Date getEatDate2() {
		return eatDate2;
	}
	
	public void setEatDate2(Date eatDate2) {
		this.eatDate2 = eatDate2;
	}

	
	
}
