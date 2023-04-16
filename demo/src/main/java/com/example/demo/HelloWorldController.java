package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @GetMapping("/hello")
    public String getHelloWorld() {
        return "Hello, World!";
    }

    @PostMapping("/hello")
    public String postHelloWorld() {
        return "Hello, World! (POST)";
    }

    @GetMapping("/hello/{name}")
    public String getHelloWithName(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
}