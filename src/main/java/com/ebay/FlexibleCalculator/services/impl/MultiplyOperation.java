package com.ebay.FlexibleCalculator.services.impl;

import com.ebay.FlexibleCalculator.enums.Operation;
import com.ebay.FlexibleCalculator.services.OperationHandler;
import org.springframework.stereotype.Service;


@Service
public class MultiplyOperation implements OperationHandler {
    @Override
    public Operation getOperation() {
        return Operation.MULTIPLY;
    }

    @Override
    public Number operate(Number num1, Number num2) {
        return num1.doubleValue() * num2.doubleValue();
    }
}
