package com.example.helloboot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBooleanProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Joshua.H.Brooks
 * @description
 */
@Configuration
public class AppFeatureConfig {

    @Bean
    @ConditionalOnBooleanProperty(prefix = "app.feature", name = "enabled")
    public String featureFlag() {
        return "功能已开启";
    }

}
