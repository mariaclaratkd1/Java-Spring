package com.example.Java13.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/welcome")
public class Welcome {

    @GetMapping("/bemvindo")
    public String welcome() {
        return "Welcome!";
    }
}