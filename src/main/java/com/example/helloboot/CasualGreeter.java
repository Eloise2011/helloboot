package com.example.helloboot;

import jakarta.annotation.Priority;
import org.springframework.stereotype.Service;

/**
 * @author Joshua.H.Brooks
 * @description
 */
@Service
@Priority(1)
public class CasualGreeter implements Greeter {

    @Override
    public String greet() {
        return "Hi there!";
    }

}
