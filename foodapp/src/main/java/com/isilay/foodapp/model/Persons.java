package com.isilay.foodapp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "food")
@NamedQueries(
        {
            @NamedQuery(name = "Persons.findAll", query = "SELECT u FROM Persons u"),
            @NamedQuery(name = "Persons.findById", query = "SELECT u FROM Persons u WHERE u.id = :id") })
public class Persons {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private short id;

	@Column(name = "name", length = 50)
	private String name;
	

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "add_date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date addDate;



	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String Name) {
		this.name = Name;
	}
	
	public Date getAddDate() {
		return addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate= addDate;
	}
	
	
}
