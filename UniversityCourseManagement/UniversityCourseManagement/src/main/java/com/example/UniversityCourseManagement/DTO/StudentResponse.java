package com.example.UniversityCourseManagement.DTO;

public class StudentResponse {

    private final Long id;
    private final String name;
    private final int age;
    private final String email;

    public StudentResponse(Long id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
}
