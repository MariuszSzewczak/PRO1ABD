package com.example.pizza.service;

import com.example.pizza.commonModel.ProductsDto;
import com.example.pizza.dao.ProductsService;
import com.example.pizza.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductService {

    @Autowired
    private ProductsService proRepository;

    public Page<ProductsDto> getProducts(Pageable pageable) {
        // check if user can do that

        return proRepository.getAllProducts(pageable);
    }
    public List<Product> getProduct() {
        return proRepository.findAll();
    }

    public void saveProduct(Product product) {
        proRepository.save(product);
    }
    public void deleteProduct(Product product) {

        proRepository.deleteById(product.getId());
    }
}
