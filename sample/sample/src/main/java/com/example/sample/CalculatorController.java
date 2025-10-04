package com.example.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calc")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/add")
    public int add(@RequestBody @jakarta.validation.Valid calculationRequest request){
        return calculatorService.add(request.getA(), request.getB());
    }

    @GetMapping("/sub")
    public int subtract(@RequestBody @jakarta.validation.Valid calculationRequest request) {
        return calculatorService.subtract(request.getA(), request.getB());
    }

    @GetMapping("/mul")
    public int multiply(@RequestBody @jakarta.validation.Valid calculationRequest request){
        return calculatorService.multiply(request.getA(), request.getB());
    }

    @GetMapping("/div")
    public int divide(@RequestBody @jakarta.validation.Valid calculationRequest request){
        if(request.getB()==0){
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return calculatorService.divide(request.getA(), request.getB());
    }

    @GetMapping("/history")
    public List<Calculation> getHistory() {
        return calculatorService.getHistory();
    }

}
