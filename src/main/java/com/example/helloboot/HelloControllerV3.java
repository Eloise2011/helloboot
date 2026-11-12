package com.example.helloboot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Joshua.H.Brooks
 * @description
 */
@RestController
public class HelloControllerV3 {

    private final GreetingProvider greetingProvider;

    public HelloControllerV3(@Qualifier("formalGreetingProvider") GreetingProvider greetingProvider) {
        this.greetingProvider = greetingProvider;
    }

    @GetMapping("/v3")
    public String hello() {
        return greetingProvider.greeting();
    }

}
