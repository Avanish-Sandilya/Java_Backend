package com.example.UniversityCourseManagement.Repository;

import com.example.UniversityCourseManagement.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
