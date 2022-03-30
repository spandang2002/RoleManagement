package com.gtm.ilern.rm.service;

import com.gtm.ilern.rm.entity.Resource;
import com.gtm.ilern.rm.entity.Role;
import com.gtm.ilern.rm.repo.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {


    @Autowired
    RoleRepository roleRepository;

    public List<Role> getAllRole()
    {
        return roleRepository.findAll();
    }

    public Role createRole(Role role)
    {
        return roleRepository.save(role);
    }
}
