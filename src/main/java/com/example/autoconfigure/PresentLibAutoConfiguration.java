package com.example.autoconfigure;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;

/**
 * @author Joshua.H.Brooks
 * @description
 */
@AutoConfiguration
@ConditionalOnClass(name = "com.example.helloboot.HelloController")
public class PresentLibAutoConfiguration {

    @Bean
    public LibraryFlag presentLibFlag() {
        return new LibraryFlag("HelloController 在 classpath 上，条件放行");
    }

}