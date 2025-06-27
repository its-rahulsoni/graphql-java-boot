package com.graphql.learning.service;

import com.graphql.learning.pojo.CreateUserInput;
import com.graphql.learning.pojo.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    private static final Map<String, User> users = new HashMap<>();

    static {
        users.put("1", new User("1", "Rahul Soni", "rahul@example.com"));
    }

    public User getUserById(String id) {
        return users.get(id);
    }

    public String getHelloMessage() {
        return "Hello from GraphQL + Spring Boot!";
    }

    public User createUser(String id, String name, String email) {
        User user = new User(id, name, email);
        users.put(id, user);
        return user;
    }

    public String getWelcomeMessage() {
        return "Welcome from GraphQL + Spring Boot!!!!";
    }

    public User createUserWithInputArgument(CreateUserInput input) {
        User user = new User(input.getId(), input.getName(), input.getEmail());
        users.put(user.getId(), user);
        return user;
    }


}
