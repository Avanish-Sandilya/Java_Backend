package com.example.UniversityCourseManagement.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="university_courses")
public class Course implements Comparable<Course>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String courseName;
    private String professorName;

    @Enumerated(EnumType.STRING)
    private CREDITS credits;

    public Course(){}

    public Course(CREDITS credits, String professorName, String courseName) {
        this.credits = credits;
        this.professorName = professorName;
        this.courseName = courseName;
    }

    public Long getId() {
        return id;
    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public CREDITS getCredits() {
        return credits;
    }

    public void setCredits(CREDITS credits) {
        this.credits = credits;
    }

    @Override
    public int compareTo(Course c) {
        int creditCompare=this.getCredits().getValue()-c.getCredits().getValue();
        int nameCompare = this.getCourseName().compareTo(c.getCourseName());
        return creditCompare==0?nameCompare:creditCompare;
    }
}
