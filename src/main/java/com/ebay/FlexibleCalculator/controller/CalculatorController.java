package com.ebay.FlexibleCalculator.controller;

import com.ebay.FlexibleCalculator.dto.ChainingOperationDto;
import com.ebay.FlexibleCalculator.dto.OperationDto;
import com.ebay.FlexibleCalculator.services.Calculator;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/calculator")
public class CalculatorController {

    private final Calculator calculator;

    @GetMapping("/calculate")
    public ResponseEntity<Number> calculate(@RequestBody OperationDto operationDto){
        Number res = calculator.calculate(operationDto.getOperation() , operationDto.getNum1(), operationDto.getNum2());
        return ResponseEntity.ok(res);
    }

    @GetMapping("/calculate-chain-operation")
    public ResponseEntity<Number> calculateChainOperation(@RequestBody ChainingOperationDto chainingOperationDto){
        Number res = calculator.calculate(chainingOperationDto.getInitialValue() , chainingOperationDto.getOperations(),chainingOperationDto.getNums());
        return ResponseEntity.ok(res);
    }

}
