package com.gtm.ilern.rm.controller;

import com.gtm.ilern.rm.entity.Action;
import com.gtm.ilern.rm.service.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/action")
public class ActionController {


    @Autowired
    ActionService actionService;

    @GetMapping
    public List<Action> getAllAction()
    {
        return actionService.getAllAction();
    }

    @PostMapping
    public Action createAction(@RequestBody Action action)
    {
        return actionService.createAction(action);
    }
}
