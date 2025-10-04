package com.example.sample;

public class CalculationResponse {
    private int a;
    private int b;
    private String operation;
    private int result;

    public CalculationResponse(int a, int b, String operation, int result) {
        this.a = a;
        this.b = b;
        this.operation = operation;
        this.result = result;
    }


    public int getA() { return a; }
    public int getB() { return b; }
    public String getOperation() { return operation; }
    public int getResult() { return result; }
}
