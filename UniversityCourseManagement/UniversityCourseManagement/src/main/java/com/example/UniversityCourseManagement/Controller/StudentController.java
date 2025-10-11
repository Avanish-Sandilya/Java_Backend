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

    @PostMapping("/add")
    public StudentResponse addStudent(@RequestBody @Valid StudentRequest request) {
        return studentService.add(request);
    }

    @GetMapping("/all")
    public List<StudentResponse> getAllStudents() {
        return studentService.getAll();
    }

    @GetMapping("/{id}")
    public StudentResponse getStudentById(@PathVariable Long id) {
        return studentService.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        return studentService.delete(id);
    }
}
