package com.isilay.foodapp.service.jpa_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isilay.foodapp.dao.PersonsDAO;
import com.isilay.foodapp.mapper.PersonsMapper;
import com.isilay.foodapp.service.PersonsService;
import com.isilay.foodapp.web.dto.PersonsDTO;

@Service
public class PersonsServiceImpl implements PersonsService{
	@Autowired
	private PersonsDAO personsDAO;
	
	@Override
	public void addPersons(PersonsDTO persons) {
		personsDAO.create(PersonsMapper.dtoToModel(persons));
		
	}

	@Override
	public void updatePersons(PersonsDTO persons) {
	personsDAO.update(PersonsMapper.dtoToModel(persons));
		
	}

	@Override
	public void deletePersons(short id) {
		personsDAO.deleteById(id);
	}

	@Override
	public PersonsDTO getPersonsById(int id) {
		
		return PersonsMapper.modelToDto(personsDAO.findOne(id));
	}

	@Override
	public List<PersonsDTO> getAllPersons() {
		// TODO Auto-generated method stub
		return PersonsMapper.modelToDtoList(personsDAO.findAll());
	}

}
