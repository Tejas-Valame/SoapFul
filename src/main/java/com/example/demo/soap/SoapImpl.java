package com.example.demo.soap;

import org.springframework.stereotype.Component;

import com.example.demo.api.ServiceImpl;
import com.example.schema.hello.v1.SayHello;
import com.example.schema.hello.v1.SayHelloResponse;
import com.example.wsdl.helloservice_wsdl.HelloPortType;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RequiredArgsConstructor
public class SoapImpl implements HelloPortType {

    private final ServiceImpl impl;

    @Override
    public SayHelloResponse sayHello(SayHello parameters) {
        log.debug("Got a SOAP request");
        SayHelloResponse response = new SayHelloResponse();
        String name = parameters != null ? parameters.getName() : null;
        response.setGreeting(impl.sayHello(name));
        return response;
    }

}
