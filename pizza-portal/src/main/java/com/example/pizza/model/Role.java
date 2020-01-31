package com.example.pizza.model;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "role")
@Data
public class Role {

    @Id @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "role_pk_seq")
    @SequenceGenerator(name = "role_pk_seq", sequenceName = "SEQ_ROLE_ID", allocationSize = 1)
    private Long id;
    
    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Column(name = "active")
    private Boolean active = false;    
}
