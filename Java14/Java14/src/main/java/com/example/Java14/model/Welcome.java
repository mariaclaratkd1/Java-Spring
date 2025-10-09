package com.example.Java14.model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/welcome")
public class Welcome {
    @GetMapping("/welcome")
    public String message() {
        return "Welcome to Java 14 with Spring Boot!";
    }
}
