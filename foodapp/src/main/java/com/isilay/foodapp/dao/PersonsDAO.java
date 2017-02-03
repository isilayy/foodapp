package com.isilay.foodapp.dao;

import javax.persistence.NoResultException;

import com.isilay.foodapp.model.Persons;



public interface PersonsDAO extends GenericDAO<Persons> {

	public Persons getPersonsByName(String Name) throws NoResultException;
}

