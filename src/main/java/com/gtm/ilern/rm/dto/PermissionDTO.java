package com.gtm.ilern.rm.dto;

public class PermissionDTO {

    private Integer id;
    private String name;
    private String resourceNmae;
    private String actionName;

    public PermissionDTO() {
    }

    public PermissionDTO(Integer id, String name, String resourceNmae, String actionName) {
        this.id = id;
        this.name = name;
        this.resourceNmae = resourceNmae;
        this.actionName = actionName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResourceNmae() {
        return resourceNmae;
    }

    public void setResourceNmae(String resourceNmae) {
        this.resourceNmae = resourceNmae;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }
}
