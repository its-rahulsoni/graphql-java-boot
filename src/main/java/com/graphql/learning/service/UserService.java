package com.graphql.learning.service;

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
}
