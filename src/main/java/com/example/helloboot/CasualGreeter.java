package com.example.helloboot;

import jakarta.annotation.Priority;
import org.springframework.stereotype.Service;

/**
 * The casual greeting implementation used by {@link HelloControllerV5}.
 *
 * <p>{@code @Priority(1)} gives it precedence over {@link FormalGreeter}, whose priority is 2, both
 * for single-bean injection and in the injected list. Compare {@code /v5} with {@code /v5/list}.
 * Without priority metadata, the selected bean or collection order is not defined.
 *
 * @author Joshua.H.Brooks
 */
@Service
@Priority(1)
public class CasualGreeter implements Greeter {

    @Override
    public String greet() {
        return "Hi there!";
    }

}
