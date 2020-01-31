package com.example.pizza.service;

import com.example.pizza.commonModel.UserDto;
import com.example.pizza.dao.UserRepository;
import com.example.pizza.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserDto getUser(String login) {
        return userRepository.getUserByLogin(login);
    }
    public void saveUser(User user) {
        userRepository.save(user);
    }
    public void deleteUser(User user) {

        userRepository.deleteById(user.getId());
    }
}
