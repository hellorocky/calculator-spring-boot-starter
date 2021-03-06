package com.rockywu;

public class CalculatorService {
    private Double times;

    public CalculatorService(Double times) {
        this.times = times;
    }

    public Double pow(Double base){
        return Math.pow(base, times);
    }

    public Integer sum(Integer a, Integer b){
        return a+b;
    }
}
