package com.example.autoconfigure;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBooleanProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * @author Joshua.H.Brooks
 * @description
 */
@AutoConfiguration
@ConditionalOnBooleanProperty(prefix = "app.greeting", name = "enabled")
@EnableConfigurationProperties(GreetingProperties.class)
public class GreetingAutoConfiguration {

    @Bean
    public Greeting greeting(GreetingProperties properties) {
        return new Greeting(properties.getMessage());
    }

}
