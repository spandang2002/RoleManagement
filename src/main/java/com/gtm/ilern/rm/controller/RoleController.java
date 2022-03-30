package com.gtm.ilern.rm.controller;

import com.gtm.ilern.rm.entity.Role;
import com.gtm.ilern.rm.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {


    @Autowired
    RoleService roleService;

    @GetMapping
    public List<Role> getAllRole()
    {
        return roleService.getAllRole();
    }

    @PostMapping
    public Role createRole(@RequestBody Role role)
    {
        return roleService.createRole(role);
    }
}
