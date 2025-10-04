package com.example.sample;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calc")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/add")
    public CalculationResponse add(@RequestBody @Valid calculationRequest request){
        return calculatorService.add(request.getA(), request.getB());
    }

    @GetMapping("/sub")
    public CalculationResponse subtract(@RequestBody @Valid calculationRequest request) {
        return calculatorService.subtract(request.getA(), request.getB());
    }

    @GetMapping("/mul")
    public CalculationResponse multiply(@RequestBody @Valid calculationRequest request){
        return calculatorService.multiply(request.getA(), request.getB());
    }

    @GetMapping("/div")
    public CalculationResponse divide(@RequestBody @Valid calculationRequest request){
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
