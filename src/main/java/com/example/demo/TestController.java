package com.example.demo;

import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/test")
public class TestController {

    @GetMapping
    @Timed("sayHello response time")
    public String sayHello() {
        return "hello";
    }
}
