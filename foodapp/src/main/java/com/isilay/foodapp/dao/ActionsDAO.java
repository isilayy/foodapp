package com.isilay.foodapp.dao;

import javax.persistence.NoResultException;

import com.isilay.foodapp.model.Actions;

public interface ActionsDAO extends GenericDAO<Actions> {

	public Actions getActionsById(int id) throws NoResultException;
}
