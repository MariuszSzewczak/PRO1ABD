package com.example.pizza.controller;

import com.example.pizza.commonModel.UserDto;
import com.example.pizza.model.User;
import com.example.pizza.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class AdminController {

    @Autowired
    private UserService userService;
    public UserDto getUser(String login) {
        return userService.getUser(login);
    }
    @PostMapping(value = "/adduser")
    public void addCompany(@RequestParam User user)
    {
        userService.saveUser(user);
    }
    @PutMapping(value = "/edituser")
    public void editCompany(@RequestParam User user)
    {
        userService.saveUser(user);
    }
    @DeleteMapping(value = "/deleteuser")
    public void deleteProduct(@RequestParam User user)
    {
        userService.deleteUser(user);
    }

}
