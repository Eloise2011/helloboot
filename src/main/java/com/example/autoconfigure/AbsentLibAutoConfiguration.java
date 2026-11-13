package com.example.autoconfigure;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;

/**
 * @author Joshua.H.Brooks
 * @description
 */
@AutoConfiguration
@ConditionalOnClass(name = "com.example.some.missing.SdkClass")
public class AbsentLibAutoConfiguration {

    @Bean
    public LibraryFlag absentLibFlag() {
        return new LibraryFlag("这行永远执行不到");
    }

}