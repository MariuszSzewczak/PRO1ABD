package com.example.pizza.commonModel;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CompanyDto {

    private Long id;
    private String name;
    private String nip;
}
