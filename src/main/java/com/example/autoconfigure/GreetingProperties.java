package com.example.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Joshua.H.Brooks
 * @description
 */
@ConfigurationProperties(prefix = "app.greeting") // 将来 yaml 里写 app.greeting.message 就会灌进 message 字段。
public class GreetingProperties {

    private String message = "Hello Auto-Configuration!";

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}