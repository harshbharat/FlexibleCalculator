package com.ebay.FlexibleCalculator.services;

import com.ebay.FlexibleCalculator.enums.Operation;

public interface OperationHandler {
    Operation getOperation();
    Number operate(Number num1,Number num2);
}
