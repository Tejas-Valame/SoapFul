package com.example.demo.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tools.jackson.databind.json.JsonMapper;
import tools.jackson.databind.module.SimpleModule;

@Configuration
public class RestConfig {

    @Bean("demoAppJacksonModule")
    SimpleModule demoAppJacksonModule() {
        SimpleModule module = new SimpleModule();
        // Register custom deserializers as required
        // module.addDeserializer(MyUser.class, new MyCustomDeserializer());
        return module;
    }

    @Bean
    JsonMapper demoJsonMapper(@Qualifier("demoAppJacksonModule") SimpleModule module) {
        return JsonMapper.builder()
                .addModule(module)
                .build();
    }
}
