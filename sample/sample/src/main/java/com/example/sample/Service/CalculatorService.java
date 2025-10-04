package com.example.sample.Service;

import com.example.sample.DTO.CalculationResponse;
import com.example.sample.Entity.Calculation;
import com.example.sample.Entity.CalculationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculatorService {

    @Autowired
    private CalculationRepository calculationRepository;


    public CalculationResponse add(int a, int b){
        int result = a + b;
        calculationRepository.save(new Calculation(a, b, "add", result));
        return new CalculationResponse(a,b,"add",result);
    }
    public CalculationResponse subtract(int a,int b){
        int result = a - b;
        calculationRepository.save(new Calculation(a, b, "subtract", result));
        return new CalculationResponse(a,b,"subtract",result);
    }

    public CalculationResponse multiply(int a,int b){
        int result = a * b;
        calculationRepository.save(new Calculation(a, b, "multiply", result));
        return new CalculationResponse(a,b,"multiply",result);
    }

    public CalculationResponse divide(int a, int b){
        int result = a / b;
        calculationRepository.save(new Calculation(a, b, "divide", result));
        return new CalculationResponse(a,b,"divide",result);
    }

    public List<Calculation> getHistory() {
        return calculationRepository.findAll();
    }

}
