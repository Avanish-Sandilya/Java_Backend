package com.example.UniversityCourseManagement.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
    @GetMapping("/")
    public String home() {
        return """
                Welcome to the University Course Management API!
                Available endpoints:
                - /students/**
                - /courses/**
                - /professors/**
                """;
    }
}
