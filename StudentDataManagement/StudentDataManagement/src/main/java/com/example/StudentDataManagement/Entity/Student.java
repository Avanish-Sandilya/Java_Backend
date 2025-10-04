package com.example.StudentDataManagement.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="studentdatamanagement")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;   // <-- instance field, not static

    private String name;
    private int age;
    private String email;
    private String grade;

    // 🔹 Constructors
    public Student() {}  // JPA requires a no-arg constructor

    public Student(String name, int age, String email, String grade) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.grade = grade;
    }

    // 🔹 Getters
    public Long getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return email; }
    public String getGrade() { return grade; }

    // 🔹 Setters (optional but common in JPA)
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setEmail(String email) { this.email = email; }
    public void setGrade(String grade) { this.grade = grade; }
}
