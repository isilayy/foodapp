package com.isilay.foodapp.web.dto;

import java.io.Serializable;
import java.util.Date;

public class PersonsDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private short id;
	private String name;
	private Date addDate;
	
	public PersonsDTO() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public short getId() {
		return id;
	}
	public Date getAddDate() {
		return addDate;
	}
	

	public String getName() {
		return name;
	}

	
	public void setId(short id) {
		this.id = id;
	}
	
	public void setAddDate(Date addDate) {
		this.addDate = addDate;
		
	}
	public void setName(String name) {
		this.name = name;
	}
}