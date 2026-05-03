module com.example.demo {

    requires java.logging;
    requires java.sql;

    requires jakarta.xml.bind;
    requires jakarta.xml.ws;

    requires static lombok;

    requires micrometer.registry.prometheus;

    requires org.apache.cxf.core;
    requires org.apache.cxf.frontend.jaxws;
    requires org.apache.cxf.spring.boot.jaxws;

    requires org.slf4j;

    requires io.swagger.v3.oas.models;
    requires io.swagger.v3.oas.annotations;

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
    opens com.example.demo.api to spring.core, spring.beans, spring.context, spring.web,
            org.apache.cxf.frontend.jaxws;
    opens com.example.demo.config to spring.core, spring.beans, spring.context, spring.web;
    opens com.example.demo.model to jakarta.xml.bind, tools.jackson.databind, spring.core,
            spring.beans, spring.context, spring.web;
    opens com.example.demo.rest to spring.core, spring.beans, spring.context, spring.web,
            org.apache.cxf.frontend.jaxws;
    opens com.example.demo.soap to spring.core, spring.beans, spring.context, spring.web,
            org.apache.cxf.frontend.jaxws;

    opens com.examples.schema.hello.v1 to spring.core, spring.beans, spring.context, spring.web,
            org.apache.cxf.frontend.jaxws, jakarta.xml.bind, jakarta.xml.ws;
    opens com.examples.wsdl.helloservice_wsdl to spring.core, spring.beans, spring.context, spring.web,
            org.apache.cxf.frontend.jaxws, jakarta.xml.bind, jakarta.xml.ws;

    exports com.example.demo;
}
