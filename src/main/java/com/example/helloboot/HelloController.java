package com.example.helloboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Provides the application's root greeting endpoint.
 *
 * <p>This method's {@code @GetMapping} maps an HTTP GET request for {@code /} to {@link #hello()}.
 * The returned String is plain-text response content. Run the application and use
 * {@code curl -i http://localhost:8080/} to see the status, content type, and body.
 *
 * @author Joshua.H.Brooks
 */
@RestController
public class HelloController {

    /**
     * Returns the root greeting.
     *
     * @return the text {@code Hello Spring Boot 4.* !}
     */
    @GetMapping("/")
    public String hello() {
        return "Hello Spring Boot 4.* !";
    }
}
