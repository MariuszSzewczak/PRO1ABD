package com.example.pizza.model;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
public class User {

    @Id @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_pk_seq")
    @SequenceGenerator(name = "user_pk_seq", sequenceName = "SEQ_USER_ID", allocationSize = 1)
    private Long id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "forename")
    private String forename;

    @Column(name = "surname")
    private String surname;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "deleted")
    private Boolean deleted;

    @Column(name = "blocked")
    private Boolean blocked;
}
