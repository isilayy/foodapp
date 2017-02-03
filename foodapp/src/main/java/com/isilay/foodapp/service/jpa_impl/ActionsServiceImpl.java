package com.isilay.foodapp.service.jpa_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isilay.foodapp.dao.ActionsDAO;
import com.isilay.foodapp.mapper.ActionsMapper;
import com.isilay.foodapp.service.ActionsService;
import com.isilay.foodapp.web.dto.ActionsDTO;

@Service
public class ActionsServiceImpl implements ActionsService {
	@Autowired
	private ActionsDAO actionsDAO;

	@Override
	public void addActions(ActionsDTO actions) {
		actionsDAO.create(ActionsMapper.dtoToModel(actions));
		
	}

	@Override
	public void updateActions(ActionsDTO actions)  {
		actionsDAO.update(ActionsMapper.dtoToModel(actions));
	}

	@Override
	public void deleteActions(int id) {
		actionsDAO.deleteById(id);
	}

	@Override
	public ActionsDTO getActionsById(int id) {
	
		return ActionsMapper.modelToDto(actionsDAO.findOne(id));
	}

	@Override
	public List<ActionsDTO> getAllActions() {
		// TODO Auto-generated method stub
		return ActionsMapper.modelToDtoList(actionsDAO.findAll());
	}
}

		

