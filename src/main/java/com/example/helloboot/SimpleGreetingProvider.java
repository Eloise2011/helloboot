package com.example.helloboot;

import org.springframework.stereotype.Service;

/**
 * @author Joshua.H.Brooks
 * @description
 */
@Service
public class SimpleGreetingProvider implements GreetingProvider {

    @Override
    public String greeting() {
        return "Hello Spring Boot 4.0! **Simple** Greeting Provider!";
    }

}
