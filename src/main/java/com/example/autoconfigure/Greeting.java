package com.example.autoconfigure;

/**
 * A greeting message produced by auto-configuration.
 *
 * @author Joshua.H.Brooks
 */
public class Greeting {

    private final String message;

    public Greeting(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

}
