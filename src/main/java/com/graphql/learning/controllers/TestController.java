package com.graphql.learning.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private static final Logger logger = LogManager.getLogger(TestController.class);

    // A simple GET request to say hello to the world ....
    @GetMapping("/hello")
    public String sayHello() {
        logger.info("Api /hello is invoked to say - Hello, World!.");
        return "Service gha-deploy2 says - Hello, World!";
    }

    // A simple GET request to respond with a healthy instance message ....
    @GetMapping("/health")
    public String sayHealthy() {
        logger.info("Api /health is invoked to say - I am Healthy!.");
        return "Service gha-deploy2 says - I am Healthy!";
    }


    // A simple GET request with a greetings message ....
    @GetMapping("/greetings")
    public String greetings() {
        logger.info("Api /greetings is invoked to say - Greetings from Service gha-deploy2. Hope you have a wonderful day ahead..");
        return "Api /greetings is invoked to say - Greetings from Service gha-deploy2. Hope you have a wonderful day ahead.";
    }

    // A simple GET request to say hello to the world ....
    @GetMapping("/bye")
    public String sayBye() {
        logger.info("Api /bye is invoked to say - Bye, World!.");
        return "Service gha-deploy2 says - Bye, World!";
    }

}
