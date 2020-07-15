package com.rockywu;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(CalculatorProperties.class)
public class CalculatorAutoConfigure {
    private final CalculatorProperties properties;

    public CalculatorAutoConfigure(CalculatorProperties properties) {
        this.properties = properties;
    }

    @Bean
    @ConditionalOnMissingBean(CalculatorService.class)
    CalculatorService calculatorService (){
        return  new CalculatorService(properties.getTimes());
    }

}
