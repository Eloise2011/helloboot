package com.example.helloboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Joshua.H.Brooks
 * @description
 */
@RestController
public class HelloControllerV5 {

    private final Greeter greeter;
    private final List<Greeter> allGreeters;

    public HelloControllerV5(Greeter greeter, List<Greeter> allGreeters) {
        this.greeter = greeter;
        this.allGreeters = allGreeters;
    }

    @GetMapping("/v5")
    public String single() {
        return greeter.greet();
    }

    @GetMapping("/v5/list")
    public List<String> all() {
        return allGreeters.stream().map(Greeter::greet).toList();
    }

}
