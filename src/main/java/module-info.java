module com.example.demo {

    requires jakarta.xml.bind;
    requires jakarta.xml.ws;

    requires static lombok;

    requires micrometer.registry.prometheus;

    requires org.apache.cxf.core;
    requires org.apache.cxf.frontend.jaxws;
    requires org.apache.cxf.spring.boot.jaxws;

    requires org.slf4j;

    requires io.swagger.v3.oas.models;

    requires org.springdoc.openapi.ui;

    requires spring.beans;
    requires spring.boot;
    requires spring.boot.actuator;
    requires spring.boot.actuator.autoconfigure;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.core;
    requires spring.web;
    requires spring.webmvc;
    requires spring.ws.core;

    requires tools.jackson.databind;

    opens com.example.demo to spring.core, spring.beans, spring.context, spring.web;
    opens com.example.demo.config to spring.core, spring.beans, spring.context, spring.web;
    opens com.example.demo.controller to spring.core, spring.beans, spring.web,
            org.apache.cxf.frontend.jaxws;
    opens com.example.demo.model to jakarta.xml.bind, tools.jackson.databind, spring.core,
            spring.beans, spring.context, spring.web;

    exports com.example.demo;
}
