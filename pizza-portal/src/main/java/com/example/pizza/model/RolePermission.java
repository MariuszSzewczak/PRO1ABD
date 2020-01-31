package com.example.pizza.model;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "role_permission")
@Data
public class RolePermission {

    @Id @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "role_permission_pk_seq")
    @SequenceGenerator(name = "role_permission_pk_seq", sequenceName = "SEQ_ROLE_PERMISSION_ID", allocationSize = 1)
    private Long id;

    @Column(name = "createDate")
    private Date createDate;    
    
    //Relations
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "roleId")
    private Role role;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "permissionId")
    private Permission permission;  
}
