package com.rockywu;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "calculator")
public class CalculatorProperties {
    private Double times = 1D;

    public Double getTimes() {
        return times;
    }

    public void setTimes(Double times) {
        this.times = times;
    }
}
