package com.gtm.ilern.rm.entity;

import com.gtm.ilern.rm.entity.Permission;
import com.gtm.ilern.rm.entity.Role;
import lombok.Data;

import javax.persistence.*;

@Table(name = "role_permission_mapping")
@Entity
@Data
public class RolePermissionMapping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @ManyToOne
    @JoinColumn(name = "permission_id")
    private Permission permission;
}