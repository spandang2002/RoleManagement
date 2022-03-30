package com.gtm.ilern.rm.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Table(name = "role")
@Entity
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "role")
    private Set<RolePermissionMapping> rolePermissionMappingSet;

}