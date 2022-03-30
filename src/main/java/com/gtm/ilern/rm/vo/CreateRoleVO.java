package com.gtm.ilern.rm.vo;

import lombok.Data;

import java.util.Set;

@Data
public class CreateRoleVO {

    private String roleName;
    Set<String> permissions;
}
