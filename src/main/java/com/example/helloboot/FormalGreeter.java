package com.example.helloboot;

import jakarta.annotation.Priority;
import org.springframework.stereotype.Service;

/**
 * @author Joshua.H.Brooks
 * @description
 */
@Service
@Priority(2)
public class FormalGreeter implements Greeter {

    @Override
    public String greet() {
        return "Good day, sir.";
    }

}
