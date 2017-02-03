package com.isilay.foodapp.service;

import java.util.List;

import com.isilay.foodapp.web.dto.PersonsDTO;

public interface PersonsService {
    public void addPersons(PersonsDTO persons);
    public void updatePersons(PersonsDTO persons);
    public void deletePersons(short id);
    public PersonsDTO getPersonsById(int id);
    public List<PersonsDTO> getAllPersons();

}
