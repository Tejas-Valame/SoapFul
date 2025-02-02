package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Hello;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@RestController
@WebService(serviceName = "helloService", portName = "helloPort", targetNamespace = "com.example.demo")
public interface Service {

    @WebMethod()
    @RequestMapping(path = "hello", method = RequestMethod.GET)
    public Hello getHello(@RequestParam(defaultValue = "World") @WebParam(name="name") String name);

}
