package com.example.UniversityCourseManagement.Repository;

import com.example.UniversityCourseManagement.Entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor,Long> {

}
