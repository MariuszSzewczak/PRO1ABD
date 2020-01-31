package com.example.pizza.dao;

import com.example.pizza.commonModel.UserDto;
import com.example.pizza.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select new com.example.pizza.commonModel.UserDto(u.id, u.login, u.password, u.forename, u.surname, u.active, u.deleted) " +
            "from User u where u.login = ?1")
    UserDto getUserByLogin(String login);

    User findByLogin(String login);
}
