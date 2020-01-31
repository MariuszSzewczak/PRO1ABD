package com.example.pizza.commonModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Long Id;
    private String login;
    private String password;
    private String forename;
    private String surname;
    private Boolean active;
    private Boolean deleted;
}
