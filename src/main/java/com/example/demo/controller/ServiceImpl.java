package com.example.demo.controller;

import org.springframework.stereotype.Component;

import com.example.demo.model.Hello;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ServiceImpl implements Service {

    @Override
    public Hello getHello(String name) {

        Hello greeting = new Hello(name);

        log.info("Returning response: {}", greeting);

        return greeting;
    }

}
