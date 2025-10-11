package com.example.UniversityCourseManagement.Service;

import com.example.UniversityCourseManagement.DTO.CourseRequest;
import com.example.UniversityCourseManagement.DTO.CourseResponse;
import com.example.UniversityCourseManagement.Entity.CREDITS;
import com.example.UniversityCourseManagement.Entity.Course;
import com.example.UniversityCourseManagement.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class courseService extends BaseService<CourseResponse, CourseRequest>{

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<CourseResponse> getAll() {
        List<Course> courses=courseRepository.findAll();
        return courses.stream().map(c->new CourseResponse(c.getId(),c.getCourseName(),c.getProfessorName(),c.getCredits())).toList();
    }

    @Override
    public CourseResponse add(CourseRequest entity) {

        Course course= new Course((CREDITS) entity.getCredit(),entity.getProfessorName(),entity.getCourseName());
        courseRepository.save(course);

        return new CourseResponse(course.getId(),course.getCourseName(),course.getProfessorName(),course.getCredits());
    }

    @Override
    public String delete(Long id) {
        CourseResponse c = getById(id);

        if(c.getId()!=null){
            courseRepository.deleteById(id);
            return  "Record deleted:\n" +
                    "Id: " + c.getId() + "\n" +
                    "Name: " +c.getCourseName() + "\n";
        }

        return "No such record exists";
    }

    @Override
    public CourseResponse getById(Long id) {

        Course course=courseRepository.findById(id).orElse(null);
        if(course!=null){
            return new CourseResponse(course.getId(), course.getCourseName(),course.getProfessorName(),course.getCredits());
        }
        return new CourseResponse(null,null,null,null);
    }
}
