package com.example.pizza.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "productsprice", indexes = {@Index(name = "INDX_productsprice_ID",  columnList= "id", unique = true)})
@Data

public class ProductPrice {

    @Id
    @Column(name = "id", updatable = false, nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "productsprice_pk_seq")
    @SequenceGenerator(name = "productsprice_pk_seq", sequenceName = "SEQ_productsprice_ID", allocationSize = 1)
    private Long id;

    @Column(name = "price", length = 255)
    private int price;

    @Column(name = "dateForm")
    private Date dateForm;

    @Column(name = "dateTo")
    private Date dateTo;
}
