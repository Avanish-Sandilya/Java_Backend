package com.example.UniversityCourseManagement.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="university_professor")
public class Professor implements Comparable<Professor> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String department;
    private String email;

    public Professor(){}

    public Professor(String email, String department, String name) {
        this.email = email;
        this.department = department;
        this.name = name;
    }

    public Long getId() {
        return id;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Professor other) {
        int nameCompare=this.getName().compareTo(other.getName());
        if(nameCompare!=0){
            return nameCompare;
        }
        return this.getDepartment().compareTo(other.getDepartment());
    }
}
