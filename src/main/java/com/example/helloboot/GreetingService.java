package com.example.helloboot;

import org.springframework.stereotype.Service;

/**
 * Supplies the greeting used by {@code HelloControllerV2}.
 *
 * <p>{@code @Service} registers this class as a Spring bean, so Spring can pass it to the controller's
 * constructor. Without it, startup fails because that constructor dependency cannot be satisfied.
 * Request {@code /v2} to see this service's greeting.
 *
 * @author Joshua.H.Brooks
 */
@Service
public class GreetingService {

    public String greeting() {
        return "Hello Spring Boot 4.0 V2 Demo!";
    }

}
