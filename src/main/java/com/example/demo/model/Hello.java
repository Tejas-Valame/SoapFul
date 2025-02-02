package com.example.demo.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Hello {

    @XmlElement(name = "greeting")
    private String greeting;

    public Hello(String name) {
        name = name == null ? "World" : name;
        greeting = "Hello " + name + "!";
    }

    @Override
    public String toString(){
        return """
                {"greeting: "%s"}""".formatted(greeting);
    }
}
