package com.graphql.learning.controllers;

import com.graphql.learning.pojo.Post;
import com.graphql.learning.pojo.User;
import com.graphql.learning.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PostFieldResolverController {

    @Autowired
    private PostService postService;

    /**
     * 📦 Use Case Example
     * Let’s say:
     * You have a User type.
     * Each user has a list of Posts.
     * So posts is a nested object field inside User. Ex: User object contains List of Posts.
     *
     * Note: Here the pojo User is modified to contain list of Posts. Rather Posts data is fetched separately while fetching User data,
     * and is then combined in the output of GraphQL.
     *
     * ✅ Spring will call this method only when posts field is requested inside user.
     */
    @SchemaMapping(typeName = "User", field = "posts")
    public List<Post> getPosts(User user) {
        return postService.getPostsByUserId(user.getId());
    }
}
