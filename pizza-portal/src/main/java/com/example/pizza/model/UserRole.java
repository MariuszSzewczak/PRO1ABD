package com.example.pizza.model;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user_role")
@Data
public class UserRole {

    @Id @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_role_pk_seq")
    @SequenceGenerator(name = "user_role_pk_seq", sequenceName = "SEQ_USER_ROLE_ID", allocationSize = 1)
    private Long id;

    @Column(name = "createDate")
    private Date createDate;    
    
    //Relations
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "roleId")
    private Role role;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User User;    
}
