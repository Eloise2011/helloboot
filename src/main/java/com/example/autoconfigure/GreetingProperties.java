package com.example.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Holds settings under the {@code app.greeting} prefix.
 *
 * <p>{@code @ConfigurationProperties} binds matching values from {@code application.yaml} onto
 * these fields; for example, {@code app.greeting.message} sets {@link #message}. Change that YAML
 * value and request {@code /auto-config/greeting} to see the configured greeting change. Without
 * this annotation, the YAML value is not bound and the default remains.
 *
 * @author Joshua.H.Brooks
 */
@ConfigurationProperties(prefix = "app.greeting")
public class GreetingProperties {

    private String message = "Hello Auto-Configuration!";

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}