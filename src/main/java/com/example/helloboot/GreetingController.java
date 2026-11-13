package com.example.helloboot;

import com.example.autoconfigure.Greeting;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Joshua.H.Brooks
 * @description
 */
@RestController
public class GreetingController {

    private final ObjectProvider<Greeting> greetingProvider;

    public GreetingController(ObjectProvider<Greeting> greetingProvider) {
        this.greetingProvider = greetingProvider;
    }

    @GetMapping("/auto-config/greeting")
    public String greeting() {
        Greeting greeting = greetingProvider.getIfAvailable();
        return greeting == null ? "自动配置未启用（没有 greeting bean）" : greeting.getMessage();
    }

}
