package com.example.UniversityCourseManagement.Entity;


import jakarta.persistence.*;

@Entity
@Table(name="university_student")
public class Student implements Comparable<Student> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    private String email;

    public Student() {}

    public Student(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }



    @Override
    public int compareTo(Student otherStudent) {
        // First compare by name (case-insensitive)
        int nameCompare = this.name.compareToIgnoreCase(otherStudent.getName());
        if (nameCompare != 0) {
            return nameCompare;
        }
        // If names are equal, compare by age
        return Integer.compare(this.age, otherStudent.getAge());
    }


}
