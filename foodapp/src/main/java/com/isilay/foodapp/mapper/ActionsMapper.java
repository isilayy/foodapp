package com.isilay.foodapp.mapper;

import java.util.ArrayList;
import java.util.List;

import com.isilay.foodapp.model.Actions;
import com.isilay.foodapp.web.dto.ActionsDTO;


public class ActionsMapper {
private ActionsMapper(){
	
}
public static ActionsDTO modelToDto(Actions model) {
	if (model == null) {
		return null;
	}
	

	
	ActionsDTO dto = new ActionsDTO();
	dto.setId(model.getId());
	dto.setEatDate2(model.getEatDate());
	
	dto.setPrice(model.getPrice());
	dto.setPerson(model.getPersons());
	return dto;
}
public static Actions dtoToModel(ActionsDTO dto) {
	if (dto == null) {
		return null;
	}
Actions model = new Actions();
	model.setId(dto.getId());;
	model.setEatDate(dto.getEatDate2());
	model.setPrice(dto.getPrice());
	model.setPersons(dto.getPerson());
	
	return model;
}
public static List<ActionsDTO> modelToDtoList(List<Actions> modelList) {
	if (modelList == null) {
		return null;
	}

	List<ActionsDTO> dtoList = new ArrayList<ActionsDTO>();
	for (Actions model : modelList) {
		dtoList.add(modelToDto(model));
	}
	return dtoList;
}
public static List<Actions> dtoToModelList(List<ActionsDTO> dtoList) {
	if (dtoList == null) {
		return null;
	}
	List<Actions> modelList = new ArrayList<Actions>();
	for (ActionsDTO dto : dtoList) {
		modelList.add(dtoToModel(dto));
	}
	return modelList;
}

}
