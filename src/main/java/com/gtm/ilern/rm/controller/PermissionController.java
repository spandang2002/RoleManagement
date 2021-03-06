package com.gtm.ilern.rm.controller;

import com.gtm.ilern.rm.dto.PermissionDTO;
import com.gtm.ilern.rm.entity.Role;
import com.gtm.ilern.rm.service.PermissionService;
import com.gtm.ilern.rm.vo.CreatePermissionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/permission")
public class PermissionController {


    @Autowired
    PermissionService permissionService;

    @GetMapping
    public List<PermissionDTO> getAllPermission()
    {
        return permissionService.getAlPermission();
    }

    @PostMapping
    public PermissionDTO createPermission(@RequestBody CreatePermissionVO createPermissionVO)
    {

        return permissionService.createPermission(createPermissionVO);
    }

    @GetMapping("{id}/roles")
    public List<Role> getPermissionRole(@RequestParam Integer id)
    {
       return permissionService.getPermissionRoles(id);
    }
}
