package com.graphql.learning.service;

import com.graphql.learning.pojo.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    public List<Post> getPostsByUserId(String userId) {

        List<Post> list1 = new ArrayList<>();
        Post p1 = new Post("ID1","Title1","Content1");
        Post p2 = new Post("ID2","Title2","Content2");
        Post p3 = new Post("ID3","Title3","Content3");
        list1.add(p1);
        list1.add(p2);
        list1.add(p3);

        return list1;
    }


}
