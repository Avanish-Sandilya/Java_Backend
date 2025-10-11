package com.example.UniversityCourseManagement.DTO;

import com.example.UniversityCourseManagement.Entity.CREDITS;

public class CourseRequest {

    private String courseName;
    private String professorName;
    private Enum<CREDITS> credit;

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

    public Enum<CREDITS> getCredit() {
        return credit;
    }

    public void setCredit(Enum<CREDITS> credit) {
        this.credit = credit;
    }
}
