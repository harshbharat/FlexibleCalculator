package com.ebay.FlexibleCalculator.exceptions;

public class OperandAndOperatorMismatchException extends RuntimeException{
    public OperandAndOperatorMismatchException() {
    }

    public OperandAndOperatorMismatchException(String message) {
        super(message);
    }
}
