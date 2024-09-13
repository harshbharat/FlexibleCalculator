package com.ebay.FlexibleCalculator.controller;

import com.ebay.FlexibleCalculator.enums.Operation;
import com.ebay.FlexibleCalculator.services.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class CalculatorTest {

    @Autowired
    private Calculator calculator;

    @Test
    public void testAddition() {
        Number result = calculator.calculate(Operation.ADD, 10, 20);
        assertEquals(30.0, result);
    }

    @Test
    public void testSubtraction() {
        Number result = calculator.calculate(Operation.SUBTRACT, 20, 10);
        assertEquals(10.0, result);
    }

    @Test
    public void testMultiplication() {
        Number result = calculator.calculate(Operation.MULTIPLY, 10, 5);
        assertEquals(50.0, result);
    }

    @Test
    public void testDivision() {
        Number result = calculator.calculate(Operation.DIVIDE, 20, 4);
        assertEquals(5.0, result);
    }

    @Test
    public void testDivisionByZero() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            calculator.calculate(Operation.DIVIDE, 10, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }

    @Test
    public void testBatchOperations() {
        Number initialValue = 0;
        List<Operation> operations = List.of(Operation.ADD, Operation.SUBTRACT, Operation.MULTIPLY);
        List<Number> numbers = List.of(10, 5, 2);

        Number result = calculator.calculate(initialValue, operations, numbers);

        assertEquals(10.0, result);
    }
}
