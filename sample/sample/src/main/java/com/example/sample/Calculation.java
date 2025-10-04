package com.example.sample;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Calculation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int a;
    private int b;
    private String operation;
    private int result;

    public Calculation() {}

    public Calculation(int a, int b, String operation, int result) {
        this.a = a;
        this.b = b;
        this.operation = operation;
        this.result = result;
    }

    public Long getId() { return id; }
    public int getA() { return a; }
    public void setA(int a) { this.a = a; }

    public int getB() { return b; }
    public void setB(int b) { this.b = b; }

    public String getOperation() { return operation; }
    public void setOperation(String operation) { this.operation = operation; }

    public int getResult() { return result; }
    public void setResult(int result) { this.result = result; }
}
