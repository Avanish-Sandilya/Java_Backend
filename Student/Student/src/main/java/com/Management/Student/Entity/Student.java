package com.Management.Student.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int age;
    private List<String> subjects;

}
