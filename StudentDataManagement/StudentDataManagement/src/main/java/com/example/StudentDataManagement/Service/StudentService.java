package com.example.StudentDataManagement.Service;

import com.example.StudentDataManagement.DTO.StudentResponse;
import com.example.StudentDataManagement.Entity.Student;
import com.example.StudentDataManagement.Entity.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public StudentResponse addNewStudent(String name, int age, String email, String grade ){
        Student saved=studentRepository.save(new Student(name,age,email,grade));
        return new StudentResponse(saved.getId(),name,age,email,grade);
    }

    public String deleteStudentRecord(Long id) throws Exception {
        try{
            studentRepository.deleteById(id);
            return "Record deleted";
        }catch (Exception e){
            return "No student found by the id";
        }

    }

    public List<StudentResponse> getAllStudents(){
        List<Student> students = studentRepository.findAll();
        List<StudentResponse> responses = new ArrayList<>();

        for (Student student : students) {
            responses.add(new StudentResponse(
                    student.getId(),
                    student.getName(),
                    student.getAge(),
                    student.getEmail(),
                    student.getGrade()
            ));
        }
        return responses;
    }

    public StudentResponse getStudentById(Long id) throws Exception {
            Student s = studentRepository.findById(id).orElse(null);
            if(s!=null){
                return new StudentResponse(s.getId(),s.getName(),s.getAge(),s.getEmail(),s.getGrade());
            }
            else{
                throw new Exception("No student found");
            }
    }


}
