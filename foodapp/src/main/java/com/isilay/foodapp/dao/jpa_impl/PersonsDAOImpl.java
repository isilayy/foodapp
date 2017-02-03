package com.isilay.foodapp.dao.jpa_impl;

import javax.persistence.NoResultException;

import org.springframework.stereotype.Repository;

import com.isilay.foodapp.dao.PersonsDAO;
import com.isilay.foodapp.model.Persons;

@Repository
public class PersonsDAOImpl extends GenericDAOImpl<Persons> implements PersonsDAO{

	public PersonsDAOImpl() {
		setClazz(Persons.class);
	}

	public void deleteById(short id) {
		// TODO Auto-generated method stub
		
	}

	public Persons getPersonsByName(String Name) throws NoResultException {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}

}
