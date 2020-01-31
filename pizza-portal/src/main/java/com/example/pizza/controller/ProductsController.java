package com.example.pizza.controller;

        import com.example.pizza.model.Product;
import com.example.pizza.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductsController {

    @Autowired
    private ProductService ps;

    @GetMapping
    public List<Product> getProducts() {
        return ps.getProduct();

    }
    @PostMapping(value = "/addproduct")
    public void addCompany(@RequestParam Product product)
    {
        ps.saveProduct(product);

    }
    @PutMapping(value = "/editproduct")
    public void editProduct(@RequestParam Product product)
    {
        ps.saveProduct(product);
    }
    @DeleteMapping(value = "/deleteproduct")
    public void deleteProduct(@RequestParam Product product)
    {
        ps.deleteProduct(product);
    }

}