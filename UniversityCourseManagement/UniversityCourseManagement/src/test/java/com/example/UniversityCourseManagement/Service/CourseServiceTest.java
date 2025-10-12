package com.example.UniversityCourseManagement.Service;

import com.example.UniversityCourseManagement.DTO.CourseRequest;
import com.example.UniversityCourseManagement.DTO.CourseResponse;
import com.example.UniversityCourseManagement.Entity.CREDITS;
import com.example.UniversityCourseManagement.Entity.Course;
import com.example.UniversityCourseManagement.Repository.CourseRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class CourseServiceTest {

    @Mock
    private CourseRepository courseRepository;

    @InjectMocks
    private courseService courseService;

    @BeforeEach
    void setup(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void TestAddNewCourse(){
        CourseRequest c = new CourseRequest();
        c.setCourseName("Physics");
        c.setProfessorName("Paul Lender");
        c.setCredit(CREDITS.valueOf("THREE"));

        CourseResponse courseResponse=courseService.add(c);

        assertEquals("Physics",courseResponse.getCourseName());
        assertEquals(CREDITS.valueOf("THREE"),courseResponse.getCredits());
        verify(courseRepository,times(1)).save(any(Course.class));
    }

    @Test
    void TestGetAllCourses(){
        Course c1 = new Course(CREDITS.FOUR,"Tim Buchalka","Java");
        Course c2= new Course(CREDITS.TWO,"Jason Fedin","C");

        when(courseRepository.findAll()).thenReturn(List.of(c1,c2));

        List<CourseResponse> courseResponses=courseService.getAll();

        assertEquals("C",courseResponses.get(1).getCourseName());
        assertEquals(CREDITS.FOUR,courseResponses.get(0).getCredits());
        verify(courseRepository,times(1)).findAll();
    }

}
