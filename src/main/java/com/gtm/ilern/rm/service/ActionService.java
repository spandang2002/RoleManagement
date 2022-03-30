package com.gtm.ilern.rm.service;

import com.gtm.ilern.rm.dto.ActionDTO;
import com.gtm.ilern.rm.entity.Action;
import com.gtm.ilern.rm.repo.ActionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActionService {


    @Autowired
    ActionRepository actionRepository;

    public List<ActionDTO> getAllAction()
    {
        List<Action> actions = actionRepository.findAll();
        List<ActionDTO> actionDTOS = new ArrayList<ActionDTO>();
        for(Action action_ : actions)
        {
            actionDTOS.add(new ActionDTO(action_.getId()+"", action_.getName()));
        }

        return actionDTOS;
    }

    public Action createAction(Action action)
    {
        return actionRepository.save(action);
    }

    public Action getActionByName(String actionName) {
        return actionRepository.findByName(actionName);
    }
}
