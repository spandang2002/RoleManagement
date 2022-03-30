package com.gtm.ilern.rm.service;

import com.gtm.ilern.rm.entity.Action;
import com.gtm.ilern.rm.repo.ActionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActionService {


    @Autowired
    ActionRepository actionRepository;

    public List<Action> getAllAction()
    {
        return actionRepository.findAll();
    }

    public Action createAction(Action action)
    {
        return actionRepository.save(action);
    }

    public Action getActionByName(String actionName) {
        return actionRepository.findByName(actionName);
    }
}
