package com.example.pizza.model;

        import lombok.Data;
        import javax.persistence.*;

@Entity
@Table(name = "products", indexes = {@Index(name = "INDX_PRODUCTS_ID",  columnList= "id", unique = true)})
@Data

public class Product {

    @Id
    @Column(name = "id", updatable = false, nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "products_pk_seq")
    @SequenceGenerator(name = "products_pk_seq", sequenceName = "SEQ_PRODUCTS_ID", allocationSize = 1)
    private Long id;

    @Column(name = "name", length = 255)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productsprice_id")
    private ProductPrice role;
}
