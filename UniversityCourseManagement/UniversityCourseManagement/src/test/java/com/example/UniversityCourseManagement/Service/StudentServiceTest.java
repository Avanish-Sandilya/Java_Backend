package com.example.UniversityCourseManagement.Service;

import com.example.UniversityCourseManagement.DTO.StudentRequest;
import com.example.UniversityCourseManagement.DTO.StudentResponse;
import com.example.UniversityCourseManagement.Entity.Student;
import com.example.UniversityCourseManagement.Repository.StudentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class StudentServiceTest {

    @Mock
    private StudentRepository studentRepository;

    @InjectMocks
    private StudentService studentService;

    @BeforeEach
    void setup(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllStudents(){

        Student s1 = new Student("Ravi",18,"ravik@gmail.com");
        Student s2 = new Student("Dinesh",17,"dineshm@gmail.com");

        when(studentRepository.findAll()).thenReturn(List.of(s1,s2));

        List<StudentResponse> responses = studentService.getAll();

        assertEquals(18,responses.get(0).getAge());
        assertEquals("Dinesh",responses.get(1).getName());
        verify(studentRepository,times(1)).findAll();
    }

    @Test
    void testAddNewStudents(){
        StudentRequest s1 = new StudentRequest();
        s1.setName("Mango");
        s1.setAge(5);
        s1.setEmail("mangojuice@gmail.com");

        StudentResponse response=studentService.add(s1);


        assertEquals("Mango",response.getName());
        assertEquals(5,response.getAge());
        verify(studentRepository,times(1)).save(any(Student.class));
    }

}
