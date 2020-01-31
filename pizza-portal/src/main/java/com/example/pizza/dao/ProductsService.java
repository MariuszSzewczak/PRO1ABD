package com.example.pizza.dao;

import com.example.pizza.commonModel.ProductsDto;
import com.example.pizza.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductsService extends JpaRepository<Product, Long> {

    @Query("select new com.example.pizza.commonModel.ProductsDto(c.id, c.name) from Product c")
    Page<ProductsDto> getAllProducts(Pageable pageable);
}
