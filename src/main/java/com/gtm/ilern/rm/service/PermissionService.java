package com.gtm.ilern.rm.service;

import com.gtm.ilern.rm.dto.PermissionDTO;
import com.gtm.ilern.rm.entity.Action;
import com.gtm.ilern.rm.entity.Permission;
import com.gtm.ilern.rm.entity.Resource;
import com.gtm.ilern.rm.entity.Role;
import com.gtm.ilern.rm.repo.PermissionRepository;
import com.gtm.ilern.rm.vo.CreatePermissionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PermissionService {


    @Autowired
    PermissionRepository permissionRepository;

    @Autowired
    ActionService actionService;

    @Autowired
    ResourceService resourceService;

    public List<Permission> getAlPermission()
    {
        return permissionRepository.findAll();
    }

    public PermissionDTO createPermission(CreatePermissionVO createPermissionVO)
    {
        Action action = actionService.getActionByName(createPermissionVO.getActionName());
        Resource resource = resourceService.getResourceByName(createPermissionVO.getResourceName());

        Permission permission = new Permission();
                permission.setAction(action);
                permission.setName(resource.getName()+"."+action.getName());
                permission.setResource(resource);
//                Permission.builder().action(action).resource(resource).name(resource.getName()+"."+action.getName()).build();

        Permission permission_ = permissionRepository.save(permission);
        PermissionDTO permissionDTO = new PermissionDTO();
        permissionDTO.setId(permission_.getId());
        permissionDTO.setName(permission_.getName());
        permissionDTO.setActionName(permission_.getAction().getName());
        permissionDTO.setResourceNmae(permission_.getResource().getName());
        return permissionDTO;
    }

    public List<Role> getPermissionRoles(Integer id)
    {
        Permission permission = permissionRepository.getById(id);
        List<Role> roleList = permission.getRolePermissionMappingSet().stream().map(x->x.getRole()).collect(Collectors.toList());
        return roleList;
    }
}
