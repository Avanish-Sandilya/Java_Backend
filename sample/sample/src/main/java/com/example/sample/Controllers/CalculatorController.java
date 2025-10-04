package com.example.sample.Controllers;

import com.example.sample.Entity.Calculation;
import com.example.sample.DTO.CalculationResponse;
import com.example.sample.Service.CalculatorService;
import com.example.sample.DTO.calculationRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calc")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @PostMapping("/add")
    public CalculationResponse add(@RequestBody @Valid calculationRequest request){
        return calculatorService.add(request.getA(), request.getB());
    }

    @PostMapping("/sub")
    public CalculationResponse subtract(@RequestBody @Valid calculationRequest request) {
        return calculatorService.subtract(request.getA(), request.getB());
    }

    @PostMapping("/mul")
    public CalculationResponse multiply(@RequestBody @Valid calculationRequest request){
        return calculatorService.multiply(request.getA(), request.getB());
    }

    @PostMapping("/div")
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
