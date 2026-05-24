package com.example.demo.api;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ServiceImpl {

    public String sayHello(String name) {
        String greeting = "Hello %s!".formatted(name == null || name.isBlank() ? "World" : name);
        log.info("Returning message: {}", greeting);
        return greeting;
    }

}
