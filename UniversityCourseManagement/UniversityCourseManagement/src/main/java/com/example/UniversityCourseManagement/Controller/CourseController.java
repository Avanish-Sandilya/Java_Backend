package com.example.UniversityCourseManagement.Controller;

import com.example.UniversityCourseManagement.DTO.CourseRequest;
import com.example.UniversityCourseManagement.DTO.CourseResponse;
import com.example.UniversityCourseManagement.Service.courseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private courseService courseService;


    @PostMapping("/add")
    public CourseResponse addCourse(@RequestBody @Valid CourseRequest request) {
        return courseService.add(request);
    }


    @GetMapping("/all")
    public List<CourseResponse> getAllCourses() {
        return courseService.getAll();
    }


    @GetMapping("/{id}")
    public CourseResponse getCourseById(@PathVariable Long id) {
        return courseService.getById(id);
    }


    @DeleteMapping("/delete/{id}")
    public String deleteCourse(@PathVariable Long id) {
        return courseService.delete(id);
    }
}
