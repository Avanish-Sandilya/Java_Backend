package com.example.UniversityCourseManagement.Controller;

import com.example.UniversityCourseManagement.DTO.StudentRequest;
import com.example.UniversityCourseManagement.DTO.StudentResponse;
import com.example.UniversityCourseManagement.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Add a student
    @PostMapping("/add")
    public StudentResponse addStudent(@RequestBody @Valid StudentRequest request) {
        return studentService.add(request);
    }

    // Get all students
    @GetMapping("/all")
    public List<StudentResponse> getAllStudents() {
        return studentService.getAll();
    }

    // Get student by ID
    @GetMapping("/{id}")
    public StudentResponse getStudentById(@PathVariable Long id) {
        return studentService.getById(id);
    }

    // Delete student by ID
    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        return studentService.delete(id);
    }
}
