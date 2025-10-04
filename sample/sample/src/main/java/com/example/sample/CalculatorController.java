package com.example.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/add")
    public int add(@RequestParam int a,@RequestParam int b){
        return calculatorService.add(a,b);
    }

    @GetMapping("/sub")
    public int subtract(@RequestParam int a, @RequestParam int b) {
        return calculatorService.subtract(a, b);
    }

    @GetMapping("/mul")
    public int multiply(@RequestParam int a,@RequestParam int b){
        return calculatorService.multiply(a,b);
    }

    @GetMapping("/div")
    public int divide(@RequestParam int a,@RequestParam int b){
        return calculatorService.divide(a,b);
    }

}
