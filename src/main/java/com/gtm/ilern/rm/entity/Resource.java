package com.gtm.ilern.rm.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "resource")
@Entity
@Data
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Lob
    @Column(name = "name", nullable = false)
    private String name;
}