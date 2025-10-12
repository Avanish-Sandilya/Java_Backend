package com.example.UniversityCourseManagement.Service;

import com.example.UniversityCourseManagement.DTO.ProfessorRequest;
import com.example.UniversityCourseManagement.DTO.ProfessorResponse;
import com.example.UniversityCourseManagement.Entity.Professor;
import com.example.UniversityCourseManagement.Repository.ProfessorRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ProfessorServiceTest {

    @Mock
    private ProfessorRepository professorRepository;

    @InjectMocks
    private ProfessorService professorService;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllProfessors() {
        // Arrange (mock data)
        Professor p1 = new Professor("john@uni.com", "CS", "Dr. John");
        p1.setId(1L);
        Professor p2 = new Professor("smith@uni.com", "Math", "Smith");
        p2.setId(2L);

        when(professorRepository.findAll()).thenReturn(List.of(p1, p2));

        // Act
        List<ProfessorResponse> result = professorService.getAll();

        // Assert
        assertEquals(2, result.size());
        assertEquals("Dr. John", result.get(0).getName());
        verify(professorRepository, times(1)).findAll();
    }

    @Test
    void testAddProfessor() {
        // Arrange
        ProfessorRequest request = new ProfessorRequest();
        request.setName("Dr. Alice");
        request.setDept("Physics");
        request.setEmail("alice@uni.com");

        // Act
        ProfessorResponse response = professorService.add(request);

        // Assert
        assertEquals("Dr. Alice", response.getName());
        assertEquals("Physics", response.getDept());
        verify(professorRepository, times(1)).save(any(Professor.class));
    }
}
