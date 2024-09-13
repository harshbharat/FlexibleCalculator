package com.ebay.FlexibleCalculator.config;

import com.ebay.FlexibleCalculator.services.Calculator;
import com.ebay.FlexibleCalculator.services.OperationHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AppConfig {
    @Bean
    public Calculator calculator(List<OperationHandler> handlers){
        return new Calculator(handlers);
    }
}
