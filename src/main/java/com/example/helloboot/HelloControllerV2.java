package com.example.helloboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Joshua.H.Brooks
 * @description
 */
@RestController
public class HelloControllerV2 {
    private final GreetingService greetingService;

    public HelloControllerV2(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/v2")
    public String helloV2() {
        return greetingService.greeting();
    }
}
