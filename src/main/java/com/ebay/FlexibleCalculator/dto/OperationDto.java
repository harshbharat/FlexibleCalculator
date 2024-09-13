package com.ebay.FlexibleCalculator.dto;

import com.ebay.FlexibleCalculator.enums.Operation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class OperationDto {

    private Number num1;
    private Number num2;
    private Operation operation;
}
