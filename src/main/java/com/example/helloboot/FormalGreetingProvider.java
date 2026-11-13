package com.example.helloboot;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
 * The formal greeting provider, ordered after {@link SimpleGreetingProvider} in collections.
 *
 * @author Joshua.H.Brooks
 */
@Service
@Order(2)
public class FormalGreetingProvider implements GreetingProvider {

    @Override
    public String greeting() {
        return "Greetings, and welcome to Spring Boot 4.0." + " **Formal** Greeting Provider!";
    }

}
