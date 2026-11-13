package com.example.helloboot;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Provides an endpoint that returns the current time.
 *
 * @author Joshua.H.Brooks
 */
@RestController
public class TimeController {

    /**
     * Returns the current local date and time as plain text.
     *
     * @return the current time prefixed with {@code 现在时间是：}
     */
    @GetMapping("/time")
    public String time() {
        return "现在时间是：" + LocalDateTime.now();
    }
}