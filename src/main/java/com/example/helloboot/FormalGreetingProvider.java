package com.example.helloboot;

import org.springframework.stereotype.Service;

/**
 * @author Joshua.H.Brooks
 * @description
 */
@Service
public class FormalGreetingProvider implements GreetingProvider {

    @Override
    public String greeting() {
        return "Greetings, and welcome to Spring Boot 4.0." + " **Formal** Greeting Provider!";
    }

}
