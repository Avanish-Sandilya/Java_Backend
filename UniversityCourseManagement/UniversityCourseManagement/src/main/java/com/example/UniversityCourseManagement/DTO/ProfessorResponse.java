package com.example.UniversityCourseManagement.DTO;

public class ProfessorResponse {

    private final Long id;
    private final String name;
    private final String dept;
    private final String email;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String getEmail() {
        return email;
    }

    public ProfessorResponse(Long id, String name, String dept, String email) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.email = email;
    }
}
