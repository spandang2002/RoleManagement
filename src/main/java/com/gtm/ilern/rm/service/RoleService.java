package com.gtm.ilern.rm.service;

import com.gtm.ilern.rm.dto.RoleDTO;
import com.gtm.ilern.rm.entity.Permission;
import com.gtm.ilern.rm.entity.Role;
import com.gtm.ilern.rm.entity.RolePermissionMapping;
import com.gtm.ilern.rm.repo.RolePermissionMappingRepository;
import com.gtm.ilern.rm.repo.RoleRepository;
import com.gtm.ilern.rm.vo.CreateRoleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleService {


    @Autowired
    RoleRepository roleRepository;

    @Autowired
    PermissionService permissionService;

    @Autowired
    RolePermissionMappingRepository rolePermissionMappingRepository;

    public List<RoleDTO> getAllRole() {
        List<RoleDTO> roleDTOS = new ArrayList<>();
        List<Role> roleList = roleRepository.findAll();
        for (Role role : roleList) {
            roleDTOS.add(new RoleDTO(role.getId(), role.getName()));
        }

        return roleDTOS;
    }

    public RoleDTO createRole(CreateRoleVO createRoleVO) {

        List<Permission> permissions = new ArrayList<Permission>();
        Role role = new Role();
        role.setName(createRoleVO.getRoleName());
        Role role_ = roleRepository.save(role);

        for (String permission : createRoleVO.getPermissions()) {
            Permission p = permissionService.getPermissionByName(permission);
            permissions.add(p);

            RolePermissionMapping rolePermissionMapping = new RolePermissionMapping();
            rolePermissionMapping.setRole(role_);
            rolePermissionMapping.setPermission(p);
            RolePermissionMapping tmp = rolePermissionMappingRepository.save(rolePermissionMapping);
        }

        List<String> permissionNameList = permissions.stream().map(x -> x.getName()).collect(Collectors.toList());

        RoleDTO roleDTO = new RoleDTO();
        roleDTO.setId(role_.getId());
        roleDTO.setName(role_.getName());
        roleDTO.setPermissions(permissionNameList);

        return roleDTO;

    }
}
