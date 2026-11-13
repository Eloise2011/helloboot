package com.example.helloboot;

import com.example.autoconfigure.Greeting;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Exposes the configured greeting over HTTP.
 *
 * <p>{@code @RestController} makes this a web controller and writes each handler's return value to
 * the response body. It is equivalent to {@code @Controller} plus class-level {@code @ResponseBody}.
 * With {@code @Controller} alone, a returned String is treated as a view name; here it is response
 * content. This method returns a String, so its response is plain text, not JSON. A returned object
 * or collection is serialized as JSON instead, for example {@code ["hello","welcome"]}.
 *
 * <p>Request {@code /auto-config/greeting} to see the configured message (or the fallback text when
 * auto-configuration is disabled).
 *
 * @author Joshua.H.Brooks
 */
@RestController
public class GreetingController {

    private final ObjectProvider<Greeting> greetingProvider;

    public GreetingController(ObjectProvider<Greeting> greetingProvider) {
        this.greetingProvider = greetingProvider;
    }

    @GetMapping("/auto-config/greeting")
    public String greeting() {
        Greeting greeting = greetingProvider.getIfAvailable();
        return greeting == null ? "自动配置未启用（没有 greeting bean）" : greeting.getMessage();
    }

}
