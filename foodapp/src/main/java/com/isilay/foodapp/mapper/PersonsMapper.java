package com.isilay.foodapp.mapper;

import java.util.ArrayList;
import java.util.List;

import com.isilay.foodapp.model.Persons;
import com.isilay.foodapp.web.dto.PersonsDTO;

public class PersonsMapper {
private PersonsMapper(){
	
}

public static PersonsDTO modelToDto(Persons model) {
	if (model == null) {
		return null;
	}
	PersonsDTO dto = new PersonsDTO();
	dto.setId(model.getId());
	dto.setName(model.getName());
	dto.setAddDate(model.getAddDate());
	return dto;
}

public static Persons dtoToModel(PersonsDTO dto) {
	if (dto == null) {
		return null;
	}
Persons model = new Persons();
	model.setId(dto.getId());
	model.setName(dto.getName());
	model.setAddDate(model.getAddDate());
	
	return model;
}

public static List<PersonsDTO> modelToDtoList(List<Persons> modelList) {
	if (modelList == null) {
		return null;
	}

	List<PersonsDTO> dtoList = new ArrayList<PersonsDTO>();
	for (Persons model : modelList) {
		dtoList.add(modelToDto(model));
	}
	return dtoList;
}
public static List<Persons> dtoToModelList(List<PersonsDTO> dtoList) {
	if (dtoList == null) {
		return null;
	}
	List<Persons> modelList = new ArrayList<Persons>();
	for (PersonsDTO dto : dtoList) {
		modelList.add(dtoToModel(dto));
	}
	return modelList;
}

}
