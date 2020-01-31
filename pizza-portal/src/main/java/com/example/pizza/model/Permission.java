package com.example.pizza.model;
import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "permission")
@Data
public class Permission {

    @Id @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "permission_pk_seq")
    @SequenceGenerator(name = "permission_pk_seq", sequenceName = "SEQ_PERMISSION_ID", allocationSize = 1)
    private Long id;

    @Column(name = "code", length = 50, nullable = false)
    private String code;

    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Column(name = "active")
    private Boolean active = false;
}
