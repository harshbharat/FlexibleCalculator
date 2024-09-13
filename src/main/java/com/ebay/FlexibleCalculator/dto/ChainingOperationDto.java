package com.ebay.FlexibleCalculator.dto;

import com.ebay.FlexibleCalculator.enums.Operation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChainingOperationDto {

    private Number initialValue;
    private List<Number> nums;
    private List<Operation> operations;
}
