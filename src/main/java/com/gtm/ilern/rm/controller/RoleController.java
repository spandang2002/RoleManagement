package com.gtm.ilern.rm.controller;

import com.gtm.ilern.rm.dto.RoleDTO;
import com.gtm.ilern.rm.service.RoleService;
import com.gtm.ilern.rm.vo.CreateRoleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {


    @Autowired
    RoleService roleService;

    @GetMapping
    public List<RoleDTO> getAllRole()
    {
        return roleService.getAllRole();
    }

    @PostMapping
    public RoleDTO createRole(@RequestBody CreateRoleVO createRoleVO)
    {
        return roleService.createRole(createRoleVO);
    }
}
