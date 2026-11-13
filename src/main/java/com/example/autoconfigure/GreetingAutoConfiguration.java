package com.example.autoconfigure;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBooleanProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * Supplies the optional {@link Greeting} bean through Spring Boot auto-configuration.
 *
 * <p>{@code @AutoConfiguration} lets Boot discover this class through the entry in
 * {@code META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports}; the
 * package is outside the application's component scan. Without that registration, Boot never applies
 * this configuration.
 *
 * <p>{@code @ConditionalOnBooleanProperty} applies the configuration only when
 * {@code app.greeting.enabled=true}. Change it to {@code false} in {@code application.yaml}, then
 * request {@code /auto-config/greeting}: the fallback response appears and the {@code greeting} bean
 * disappears from {@code /actuator/beans}. The same condition also controls {@code featureFlag} in
 * {@link com.example.helloboot.AppFeatureConfig}.
 *
 * <p>{@code @EnableConfigurationProperties} registers {@link GreetingProperties} as a bean and binds
 * {@code app.greeting.*} settings to it. Without this, the factory method cannot receive the
 * properties object when the condition is enabled.
 *
 * @author Joshua.H.Brooks
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
