package com.example.helloboot;

import org.springframework.stereotype.Service;

/**
 * @author Joshua.H.Brooks
 * @description
 */
@Service
public class GreetingService {

    public String greeting() {
        return "Hello Spring Boot 4.0 V2 Demo!";
    }

}
