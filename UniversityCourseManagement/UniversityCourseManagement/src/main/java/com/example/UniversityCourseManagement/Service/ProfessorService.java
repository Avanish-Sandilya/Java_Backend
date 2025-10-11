package com.example.UniversityCourseManagement.Service;

import com.example.UniversityCourseManagement.DTO.ProfessorRequest;
import com.example.UniversityCourseManagement.DTO.ProfessorResponse;
import com.example.UniversityCourseManagement.Entity.Professor;
import com.example.UniversityCourseManagement.Repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProfessorService extends BaseService<ProfessorResponse, ProfessorRequest> {

    @Autowired
    private ProfessorRepository professorRepository;

    @Override
    public List<ProfessorResponse> getAll() {
        List<Professor> professors=professorRepository.findAll();
        return professors.stream().map(p->new ProfessorResponse(p.getId(),p.getName(),p.getDepartment(),p.getEmail())).toList();
    }

    @Override
    public ProfessorResponse add(ProfessorRequest entity) {
        Professor professor=new Professor(entity.getName(),entity.getDept(),entity.getEmail());
        professorRepository.save(professor);
        return new ProfessorResponse(professor.getId(), professor.getName(), professor.getDepartment(), professor.getEmail());
    }

    @Override
    public String delete(Long id) {
        ProfessorResponse professorResponse=getById(id);
        if(professorResponse.getId()!=null){
            professorRepository.deleteById(id);
            return  "Record deleted:\n" +
                    "Id: " + professorResponse.getId() + "\n" +
                    "Name: " + professorResponse.getName() + "\n";
        }

        return "No such record exists";
    }

    @Override
    public ProfessorResponse getById(Long id) {
        Professor p= professorRepository.findById(id).orElse(null);
        if(p!=null){
            return new ProfessorResponse(p.getId(),p.getName(),p.getDepartment(),p.getEmail());
        }else{
            return new ProfessorResponse(null,null,null,null);
        }
    }
}
