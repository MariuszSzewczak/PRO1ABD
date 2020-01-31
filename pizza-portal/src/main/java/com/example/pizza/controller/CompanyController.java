package com.example.pizza.controller;

import com.example.pizza.model.Company;
import com.example.pizza.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping
    public List<Company> getDogs() {
        return companyService.getCompany();
    }
    @PostMapping(value = "/addcompany")
        public void addCompany(@RequestParam Company company)
    {
            companyService.saveCompany(company);

    }
    @PutMapping(value = "/editcompany")
    public void editCompany(@RequestParam Company company)
    {
        companyService.saveCompany(company);
    }
    @DeleteMapping(value = "/deletecompany")
    public void deleteProduct(@RequestParam Company company)
    {
        companyService.deleteCompany(company);
    }


}