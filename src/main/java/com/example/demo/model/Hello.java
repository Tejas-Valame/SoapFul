package com.example.demo.model;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@XmlRootElement
public class Hello {

    private String greeting;

    public Hello(String name) {
        name = name == null ? "World" : name;
        greeting = "Hello " + name + "!";
    }

    @Override
    public String toString() {
        return """
                {"greeting: "%s"}""".formatted(greeting);
    }
}
