package com.example.pizza.service;

import com.example.pizza.commonModel.CompanyDto;
import com.example.pizza.dao.CompanyRepository;
import com.example.pizza.model.Company;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public Page<CompanyDto> getCompanies(Pageable pageable) {
        // check if user can do that

        return companyRepository.getAllCompanies(pageable);
    }
    public List<Company> getCompany() {
        return companyRepository.findAll();
    }
    public void saveCompany(Company company) {
         companyRepository.save(company);
    }
    public void deleteCompany(Company company) {

        companyRepository.deleteById(company.getId());
    }
}
