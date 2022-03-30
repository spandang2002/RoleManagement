package com.gtm.ilern.rm.dto;

import lombok.Data;

@Data
public class PermissionDTO {

    private Integer id;
    private String name;
    private String resourceNmae;
    private String actionName;

}
