package com.example.UniversityCourseManagement.Service;

import com.example.UniversityCourseManagement.DTO.StudentRequest;
import com.example.UniversityCourseManagement.DTO.StudentResponse;
import com.example.UniversityCourseManagement.Entity.Student;
import com.example.UniversityCourseManagement.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService extends BaseService<StudentResponse, StudentRequest> {
    @Autowired
    private StudentRepository studentRepository;


    @Override
    public List<StudentResponse> getAll() {

        List<Student> studentsList = studentRepository.findAll();
        return studentsList.stream().map(s -> new StudentResponse(s.getId(),s.getName(),s.getAge(),s.getEmail())).toList();
    }

    @Override
    public StudentResponse add(StudentRequest entity) {
        Student s = new Student(entity.getName(),entity.getAge(),entity.getEmail());
        studentRepository.save(s);
        return new StudentResponse(s.getId(),s.getName(),s.getAge(),s.getEmail());
    }

    @Override
    public String delete(Long id) {
        StudentResponse s= getById(id);
        if(s.getAge()!=-1){
            studentRepository.deleteById(id);

            return  "Record deleted:\n" +
                    "Id: " + s.getId() + "\n" +
                    "Name: " + s.getName() + "\n";
        }
        return "No such record exists";
    }

    @Override
    public StudentResponse getById(Long id) {
        Student student=studentRepository.findById(id).orElse(null);
        if(student!=null){
            return new StudentResponse(student.getId(),student.getName(),student.getAge(),student.getEmail());
        }else{
            return new StudentResponse(null,null,-1,null);
        }
    }
}
