package com.example.pizza.dao;

import com.example.pizza.commonModel.CompanyDto;
import com.example.pizza.model.Company;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CompanyRepository extends JpaRepository<Company, Long> {

    @Query("select new com.example.pizza.commonModel.CompanyDto(c.id, c.name, c.nip) from Company c")
    Page<CompanyDto> getAllCompanies(Pageable pageable);
}
