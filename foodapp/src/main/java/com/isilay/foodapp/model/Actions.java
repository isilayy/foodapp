package com.isilay.foodapp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "actions")
@NamedQueries({
	@NamedQuery(name = "Actions.ACTIONS_BY_ID", query = "select a from Actions a where a.id=:id")
})
public class Actions {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "eatDate", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date eatDate;

	@Column(name = "price")
	private double price;

	@OneToOne
	@JoinColumn(name = "persons_id")
	private Persons persons;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getEatDate() {
		return eatDate;
	}

	public void setEatDate(Date eatDate) {
		this.eatDate = eatDate;
	}
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price= price;
	}
	
	public Persons getPersons(){
		return persons;
	}
	public void setPersons(Persons persons){
		this.persons=persons;
	}
	
	
}
