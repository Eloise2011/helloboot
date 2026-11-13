package com.example.helloboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Starts the application and enables Spring Boot's default setup.
 *
 * <p>{@code @SpringBootApplication} combines configuration, auto-configuration, and component scanning
 * from this package. This is why controllers and services in {@code com.example.helloboot} are found
 * without listing each one manually. Without it, the web application and those beans are not assembled.
 * When running the app, verify the result by requesting {@code /} or inspecting {@code /actuator/beans}.
 */
@SpringBootApplication
public class HelloBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloBootApplication.class, args);
    }
}
