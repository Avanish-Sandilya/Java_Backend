package com.example.sample;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello, Spring boot";
    }
}
