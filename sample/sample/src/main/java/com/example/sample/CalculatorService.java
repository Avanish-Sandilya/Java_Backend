package com.example.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculatorService {

    @Autowired
    private CalculationRepository calculationRepository;

    public int add(int a,int b){
        int result = a + b;
        calculationRepository.save(new Calculation(a, b, "add", result));
        return result;
    }
    public int subtract(int a,int b){
        int result = a - b;
        calculationRepository.save(new Calculation(a, b, "subtract", result));
        return result;
    }

    public int multiply(int a,int b){
        int result = a * b;
        calculationRepository.save(new Calculation(a, b, "multiply", result));
        return result;
    }

    public int divide(int a, int b){
        int result = a / b;
        calculationRepository.save(new Calculation(a, b, "divide", result));
        return result;
    }

    public List<Calculation> getHistory() {
        return calculationRepository.findAll();
    }

}
