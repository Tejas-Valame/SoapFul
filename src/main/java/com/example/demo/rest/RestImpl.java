package com.example.demo.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.example.demo.api.ServiceImpl;
import com.example.demo.model.Hello;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RequiredArgsConstructor
public class RestImpl implements SwaggerDocumentation{

    private final ServiceImpl impl;

    @Override
    public ResponseEntity<?> sayHello(String name) {
        log.debug("Got a REST request");
        Hello greeting = new Hello();
        greeting.setGreeting(impl.sayHello(name));
        return ResponseEntity.ok(greeting);
    }

}
