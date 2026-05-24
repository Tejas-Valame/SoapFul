package com.example.demo.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.models.annotations.OpenAPI30;


@OpenAPI30
@RestController
public interface SwaggerDocumentation {

    @RequestMapping(path = "hello", method = RequestMethod.GET)
    @ApiResponse(responseCode="200")
    public ResponseEntity<?> sayHello(@RequestParam(defaultValue = "") String name);

}
