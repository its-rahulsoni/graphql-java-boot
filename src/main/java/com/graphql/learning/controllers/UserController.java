package com.graphql.learning.controllers;

import com.graphql.learning.pojo.User;
import com.graphql.learning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @QueryMapping
    public String hello() {
        return userService.getHelloMessage();
    }

    @QueryMapping
    public User user(@Argument String id) {
        return userService.getUserById(id);
    }
}

