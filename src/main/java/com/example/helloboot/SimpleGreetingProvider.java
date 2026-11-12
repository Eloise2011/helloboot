package com.example.helloboot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author Joshua.H.Brooks
 * @description
 */
@Service
@Primary
public class SimpleGreetingProvider implements GreetingProvider {

    @Override
    public String greeting() {
        return "Hello Spring Boot 4.0! **Simple** Greeting Provider!";
    }

}