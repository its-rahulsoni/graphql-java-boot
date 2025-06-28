package com.graphql.learning.controllers;

import com.graphql.learning.pojo.User;
import com.graphql.learning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * Default Behavior: Method name must match the Query Field name defined in Schema file.
     */
    @QueryMapping
    public String hello() {
        return userService.getHelloMessage();
    }

    @QueryMapping
    public User user(@Argument String id) {
        return userService.getUserById(id);
    }

    @MutationMapping
    public User createUser(@Argument String id, @Argument String name, @Argument String email) {
        return userService.createUser(id, name, email);
    }

    /**
     * NOT Default Behavior: If Method name must match the Query Field name defined in Schema file?
     * We should Override the Field Name:
     *  Use @QueryMapping(name = "hello") to explicitly map.
     *  ✔ Now it will work, even though the method name is different.
     *
     * 🔸Same applies to:
     * @MutationMapping(name = "...")
     *
     * @SchemaMapping(typeName = "...", field = "...")
     */
    @QueryMapping(name = "welcome")
    public String welcomeMessage() {
        return userService.getWelcomeMessage();
    }

    @QueryMapping
    public User customException(@Argument String id) {
        return userService.getUserByIdCustomException(id);
    }
}

