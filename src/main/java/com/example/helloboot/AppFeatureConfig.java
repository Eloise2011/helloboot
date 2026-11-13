package com.example.helloboot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBooleanProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Defines application-specific beans.
 *
 * <p>{@code @Configuration} tells Spring to process this class for bean definitions. Without it,
 * the {@code featureFlag} bean below is not registered; with the current YAML, look for it at
 * {@code /actuator/beans}.
 *
 * @author Joshua.H.Brooks
 */
@Configuration
public class AppFeatureConfig {

    /**
     * Creates the optional feature flag bean.
     *
     * <p>{@code @Bean} registers this method's return value in Spring's application context, using
     * the method name ({@code featureFlag}) as the bean name. The current
     * {@code app.feature.enabled=true} setting in {@code application.yaml} allows this bean to appear;
     * set it to {@code false} and refresh {@code /actuator/beans} to observe it disappear. If the
     * annotation is omitted, the returned String is not registered.
     *
     * @return the feature-enabled message
     */
    @Bean
    @ConditionalOnBooleanProperty(prefix = "app.feature", name = "enabled")
    public String featureFlag() {
        return "功能已开启";
    }

}
