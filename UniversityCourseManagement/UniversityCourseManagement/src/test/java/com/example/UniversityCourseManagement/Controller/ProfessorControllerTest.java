package com.example.UniversityCourseManagement.Controller;

import com.example.UniversityCourseManagement.Entity.Professor;
import com.example.UniversityCourseManagement.Repository.ProfessorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class ProfessorControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ProfessorRepository professorRepository;

    @Test
    void testGetAllProfessors() throws Exception {
        // Insert sample data in test DB
        professorRepository.save(new Professor("Dr. Jane", "Chemistry", "jane@uni.com"));

        mockMvc.perform(get("/professors"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].name").value("Dr. Jane"));
    }

    @Test
    void testAddProfessor() throws Exception {
        String requestBody = """
            {
              "name": "Dr. Rahul",
              "dept": "CS",
              "email": "rahul@uni.com"
            }
            """;

        mockMvc.perform(post("/professors")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(requestBody))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Dr. Rahul"));
    }
}
