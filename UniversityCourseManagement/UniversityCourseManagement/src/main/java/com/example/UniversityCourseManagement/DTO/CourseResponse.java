package com.example.UniversityCourseManagement.DTO;

import com.example.UniversityCourseManagement.Entity.CREDITS;

public class CourseResponse {

    private final Long id;
    private final String courseName;
    private final String professorName;
    private final Enum<CREDITS> credits;

    public CourseResponse(Long id, String courseName, String professorName, Enum<CREDITS> credits) {
        this.id = id;
        this.courseName = courseName;
        this.professorName = professorName;
        this.credits = credits;
    }

    public Long getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getProfessorName() {
        return professorName;
    }

    public Enum<CREDITS> getCredits() {
        return credits;
    }
}
