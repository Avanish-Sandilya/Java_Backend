package com.example.UniversityCourseManagement.Controller;

import com.example.UniversityCourseManagement.DTO.ProfessorRequest;
import com.example.UniversityCourseManagement.DTO.ProfessorResponse;
import com.example.UniversityCourseManagement.Service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/professors")
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    @PostMapping("/add")
    public ProfessorResponse addProfessor(@RequestBody @Valid ProfessorRequest request) {
        return professorService.add(request);
    }

    @GetMapping("/all")
    public List<ProfessorResponse> getAllProfessors() {
        return professorService.getAll();
    }

    @GetMapping("/{id}")
    public ProfessorResponse getProfessorById(@PathVariable Long id) {
        return professorService.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProfessor(@PathVariable Long id) {
        return professorService.delete(id);
    }
}
