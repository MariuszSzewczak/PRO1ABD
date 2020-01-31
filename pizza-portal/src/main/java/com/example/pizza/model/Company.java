package com.example.pizza.model;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "company", indexes = {@Index(name = "INDX_COMPANY_ID",  columnList= "id", unique = true)})
@Data

public class Company {

    @Id @Column(name = "id", updatable = false, nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "company_pk_seq")
    @SequenceGenerator(name = "company_pk_seq", sequenceName = "SEQ_COMPANY_ID", allocationSize = 1)
    private Long id;

    @Column(name = "name", length = 255)
    private String name;
    
    @Column(name = "nip")
    private String nip;
}
