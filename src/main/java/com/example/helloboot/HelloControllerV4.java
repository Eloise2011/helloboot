package com.example.helloboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Joshua.H.Brooks
 * @description
 */
@RestController
public class HelloControllerV4 {

    private final List<GreetingProvider> providers;

    public HelloControllerV4(List<GreetingProvider> providers) {
        this.providers = providers;
    }

    @GetMapping("/v4")
    public List<String> hello() {
        return providers.stream().map(GreetingProvider::greeting).toList();
    }

}