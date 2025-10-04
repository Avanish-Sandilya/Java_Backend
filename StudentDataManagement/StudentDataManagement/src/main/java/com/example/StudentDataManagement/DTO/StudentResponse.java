package com.example.StudentDataManagement.DTO;

public class StudentResponse {
    private Long id;
    private String name;
    private Integer age;
    private String email;
    private String grade;

    public StudentResponse(Long id,String name, int age, String email, String grade) {
        this.id=id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getGrade() {
        return grade;
    }

    public Long getId() {
        return id;
    }
}
