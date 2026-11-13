package com.example.helloboot;

import jakarta.annotation.Priority;
import org.springframework.stereotype.Service;

/**
 * The formal greeting implementation used by {@link HelloControllerV5}.
 *
 * @author Joshua.H.Brooks
 */
@Service
@Priority(2)
public class FormalGreeter implements Greeter {

    @Override
    public String greet() {
        return "Good day, sir.";
    }

}
