package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Hello;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@WebService(serviceName = "helloService", portName = "helloPort", targetNamespace = "com.example.demo")
public class ServiceImpl implements Service {

    @Override
    @WebMethod()
    @RequestMapping(path = "hello", method = RequestMethod.GET)
    public Hello getHello(@RequestParam(defaultValue = "World") @WebParam(name="name") String name) {
        Hello greeting = new Hello(name);
        log.info("Returning response: {}", greeting);
        return greeting;
    }

}
