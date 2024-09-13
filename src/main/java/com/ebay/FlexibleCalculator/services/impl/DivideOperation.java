package com.ebay.FlexibleCalculator.services.impl;

import com.ebay.FlexibleCalculator.enums.Operation;
import com.ebay.FlexibleCalculator.services.OperationHandler;
import org.springframework.stereotype.Service;


@Service
public class DivideOperation implements OperationHandler {
    @Override
    public Operation getOperation() {
        return Operation.DIVIDE;
    }

    @Override
    public Number operate(Number num1, Number num2) {
        if(num2.doubleValue()==0)
            throw new ArithmeticException("Cannot divide by zero");

        return num1.doubleValue()/num2.doubleValue();
    }
}
