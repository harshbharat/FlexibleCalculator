package com.ebay.FlexibleCalculator.services;

import com.ebay.FlexibleCalculator.enums.Operation;
import com.ebay.FlexibleCalculator.exceptions.OperandAndOperatorMismatchException;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class Calculator {
    private final Map<Operation, OperationHandler> operationsHandler = new HashMap<>();

    public Calculator(List<OperationHandler> handlerList){
        for(OperationHandler operationHandler : handlerList)
            operationsHandler.put(operationHandler.getOperation(),operationHandler);
    }

    public Number calculate(Operation operation,Number number1,Number number2){
        OperationHandler operationHandler = operationsHandler.get(operation);

        if(operationHandler==null)
            throw new UnsupportedOperationException("Operation not supported: "+operation);

        return operationHandler.operate(number1,number2);
    }

    public Number calculate(Number initialValue,List<Operation> operations,List<Number> numbers){
        if(operations.size()!= numbers.size())
            throw new OperandAndOperatorMismatchException("Mismatch between operations and operands");

        Number result = initialValue;

        for(int i=0;i<operations.size();++i)
            result = calculate(operations.get(i),result,numbers.get(i));

        return result;
    }
}
