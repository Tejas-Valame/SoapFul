module com.example.demo {

        requires static java.compiler;
        requires static lombok;

        requires com.fasterxml.classmate;
        requires com.fasterxml.jackson.databind;

        requires io.prometheus.metrics.config;
        requires io.prometheus.metrics.core;
        requires io.prometheus.writer.text;
        requires io.prometheus.metrics.model;
        requires io.prometheus.metrics.tracer.common;

        requires io.swagger.v3.core;
        requires io.swagger.v3.oas.models;
        requires io.swagger.v3.oas.annotations;

        requires java.logging;

        requires jakarta.annotation;
        requires jakarta.validation;
        requires jakarta.xml.bind;
        requires jakarta.xml.ws;

        requires micrometer.registry.prometheus;
        requires neethi;

        requires org.apache.commons.lang3;
        requires org.apache.commons.logging;
        requires org.apache.cxf.binding.soap;
        requires org.apache.cxf.binding.xml;
        requires org.apache.cxf.core;
        requires org.apache.cxf.databinding.jaxb;
        requires org.apache.cxf.frontend.jaxws;
        requires org.apache.cxf.frontend.simple;
        requires org.apache.cxf.metrics;
        requires org.apache.cxf.spring.boot.autoconfigure;
        requires org.apache.cxf.spring.boot.jaxws;
        requires org.apache.cxf.transport.http;
        requires org.apache.cxf.ws.addr;
        requires org.apache.cxf.ws.policy;
        requires org.apache.cxf.wsdl;
        requires org.apache.tomcat.embed.core;
        requires org.apache.tomcat.embed.websocket;

        requires org.hibernate.validator;
        requires org.jspecify;
        requires org.slf4j;

        requires spring.aop;
        requires spring.beans;
        requires spring.boot;
        requires spring.boot.actuator;
        requires spring.boot.actuator.autoconfigure;
        requires spring.boot.autoconfigure;
        requires spring.boot.health;
        requires spring.boot.http.converter;
        requires spring.boot.micrometer.metrics;
        requires spring.boot.micrometer.observation;
        requires spring.boot.servlet;
        requires spring.boot.tomcat;
        requires spring.boot.validation;
        requires spring.boot.web.server;
        requires spring.boot.webmvc;
        requires spring.boot.webservices;
        requires spring.context;
        requires spring.core;
        requires spring.expression;
        requires spring.web;
        requires spring.webmvc;
        requires spring.ws.core;
        requires spring.xml;

        requires swagger.ui;

        requires tools.jackson.databind;

        requires xmlschema.core;

        opens com.example.demo to spring.aop, spring.beans, spring.context, spring.core, spring.web;
        opens com.example.demo.api to spring.aop, spring.beans, spring.context, spring.core, spring.web;
        opens com.example.demo.config to spring.aop, spring.beans, spring.context, spring.core, spring.web;

        opens com.example.demo.rest to spring.aop, spring.core, spring.beans, spring.context, spring.web,
                        org.apache.cxf.frontend.jaxws;
        opens com.example.demo.soap to spring.aop, spring.core, spring.beans, spring.context, spring.web,
                        org.apache.cxf.frontend.jaxws;

        opens com.example.schema.hello.v1 to spring.aop, spring.core, spring.beans, spring.context, spring.web,
                        org.apache.cxf.frontend.jaxws, jakarta.xml.bind, jakarta.xml.ws;
        opens com.example.types to com.fasterxml.jackson.databind, tools.jackson.databind;

        opens com.example.wsdl.helloservice_wsdl to spring.aop, spring.core, spring.beans, spring.context, spring.web,
                        org.apache.cxf.frontend.jaxws, jakarta.xml.bind, jakarta.xml.ws;

        exports com.example.demo;

}
