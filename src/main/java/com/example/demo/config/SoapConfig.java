package com.example.demo.config;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.controller.ServiceImpl;

import jakarta.xml.ws.Endpoint;
import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class SoapConfig {

    // All final members will injected by lombok
    private final Bus bus;
    private final ServiceImpl impl;

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, impl);
        endpoint.publish("/hello");
        return endpoint;
    }
}
