package com.graphql.learning.controllers;


import com.graphql.learning.pojo.CreateUserInput;
import com.graphql.learning.pojo.User;
import com.graphql.learning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller
public class InputArgumentMutationController {

    @Autowired
    private UserService userService;

    @MutationMapping
    public User createUserWithInputArgument(@Argument CreateUserInput input) {
        return userService.createUserWithInputArgument(input);
    }
}
