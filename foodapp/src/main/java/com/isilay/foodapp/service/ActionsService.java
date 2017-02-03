package com.isilay.foodapp.service;

import java.util.List;

import com.isilay.foodapp.web.dto.ActionsDTO;

public interface ActionsService {
public void addActions (ActionsDTO actions) ;
public void updateActions (ActionsDTO actions);
public void deleteActions(int id);
public ActionsDTO getActionsById(int id);
public List<ActionsDTO> getAllActions();
}
