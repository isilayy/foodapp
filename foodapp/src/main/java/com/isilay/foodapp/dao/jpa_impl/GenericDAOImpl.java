package com.isilay.foodapp.dao.jpa_impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.isilay.foodapp.dao.GenericDAO;

public abstract class GenericDAOImpl<T> implements GenericDAO<T>  {
	private Class<T> clazz;

	@PersistenceContext
	EntityManager em;

	public final void setClazz(Class<T> clazzToSet) {
		this.clazz = clazzToSet;
	}
	public T findOne(short id) {
		return em.find(clazz, id);
	}
	
	public T findOne(int id) {
		return em.find(clazz, id);
	}
	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		return em.createQuery("from " + clazz.getName()).getResultList();
	}
	@Transactional
	public void create(T entity) {
		em.persist(entity);
	}

	@Transactional
	public T update(T entity) {
		return em.merge(entity);
	}

	@Transactional
	public void delete(T entity) {
		entity = em.merge(entity);
		em.remove(entity);
	}

	@Transactional
	public void deleteById(short id) {
		T entity = em.find(clazz, id);
		em.remove(entity);
	}
	
	@Transactional
	public void deleteById(int id) {
		T entity = em.find(clazz, id);
		em.remove(entity);
		
	}
	public int getRowCount() {
		return ((Long) em.createQuery("select count(d.id) from " + clazz.getName() + " d").getSingleResult()).intValue();
	}


}
