package com.isilay.foodapp.dao.jpa_impl;

import javax.persistence.NoResultException;

import org.springframework.stereotype.Repository;

import com.isilay.foodapp.dao.ActionsDAO;
import com.isilay.foodapp.model.Actions;

@Repository
public class ActionsDAOImpl extends GenericDAOImpl<Actions> implements ActionsDAO{

	public ActionsDAOImpl() {
		setClazz(Actions.class);
	}


	public Actions getActionsById(int id) throws NoResultException {
		// TODO Auto-generated method stub
		return null;
	}

	



}
