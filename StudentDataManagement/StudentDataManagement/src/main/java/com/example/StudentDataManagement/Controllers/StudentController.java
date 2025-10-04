package com.example.StudentDataManagement.Controllers;


import com.example.StudentDataManagement.DTO.StudentRequest;
import com.example.StudentDataManagement.DTO.StudentResponse;
import com.example.StudentDataManagement.Entity.Student;
import com.example.StudentDataManagement.Service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public StudentResponse add(@RequestBody @Valid StudentRequest request){
        return studentService.addNewStudent(request.getName(),request.getAge(), request.getEmail(), request.getGrade());
    }

    @DeleteMapping("/deleteStudent/{id}")
    public String delete(@PathVariable Long id) throws Exception {
        return studentService.deleteStudentRecord(id);
    }

    @GetMapping("/allStudents")
    public List<StudentResponse> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public StudentResponse getStudentById(@PathVariable @Valid Long id) throws Exception {
        return studentService.getStudentById(id);
    }


}
