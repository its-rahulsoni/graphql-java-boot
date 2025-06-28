package com.graphql.learning.controllers;

import com.graphql.learning.pojo.*;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class Interface_Union_CustomScalars_Controller {

    @QueryMapping
    public List<IUser> allUsers() {
        return List.of(
                new Admin("1", "Rahul", "SUPER_ADMIN"),
                new Customer("2", "Amit", List.of("Item1", "Item2"))
        );
    }

    @QueryMapping
    public List<Object> search(@Argument String text) {
        return List.of(
                new Post("1", "GraphQL Intro","Content of post"),
                new Comment("2", "Great article!","Content of post")
        );
    }



}
