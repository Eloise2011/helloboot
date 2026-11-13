package com.example.helloboot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Exposes the selected greeting provider at {@code /v3}.
 *
 * @author Joshua.H.Brooks
 */
@RestController
public class HelloControllerV3 {

    private final GreetingProvider greetingProvider;

    /**
     * Uses the named provider rather than the default {@link SimpleGreetingProvider}.
     *
     * <p>{@code @Qualifier} selects the bean named {@code formalGreetingProvider}, even though the
     * simple provider is the default choice for a single injection. Without the qualifier Spring would
     * inject that default here. Compare {@code /v3} with {@code /v4} to see the selected greeting and collection.
     *
     * @param greetingProvider the explicitly selected formal provider
     */
    public HelloControllerV3(@Qualifier("formalGreetingProvider") GreetingProvider greetingProvider) {
        this.greetingProvider = greetingProvider;
    }

    @GetMapping("/v3")
    public String hello() {
        return greetingProvider.greeting();
    }

}
