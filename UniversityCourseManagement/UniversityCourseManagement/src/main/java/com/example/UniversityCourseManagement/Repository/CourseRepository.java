package com.example.UniversityCourseManagement.Repository;

import com.example.UniversityCourseManagement.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {
}
