package com.example.helloboot;

import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
 * The simple greeting implementation and default {@link GreetingProvider}.
 *
 * <p>{@code @Primary} makes this bean the default for a single {@code GreetingProvider} injection,
 * unless another bean is explicitly selected; compare {@code /v3} with {@code /v4}.
 * {@code @Order} places it before the formal provider in collections such as {@code /v4}. Without
 * ordering metadata, collection order is unspecified; ordering does not choose the default bean for
 * a single injection.
 *
 * @author Joshua.H.Brooks
 */
@Service
@Primary
@Order(1)
public class SimpleGreetingProvider implements GreetingProvider {

    @Override
    public String greeting() {
        return "Hello Spring Boot 4.0! **Simple** Greeting Provider!";
    }

}