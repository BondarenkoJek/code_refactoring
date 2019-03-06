package com.bondarenkojek;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivisionIntCalculatorTest {
    private Calculator<Integer> calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new DivisionIntCalculator();
    }

    @Test
    public void calculateCaseOk() throws Exception {
        int expectedResult = 1;
        int actualResult = calculator.calculate(6, 4);
        assertEquals(expectedResult, actualResult);
    }

    @Test(expected = ArithmeticException.class)
    public void calculateCaseException() throws Exception {
        calculator.calculate(1, 0);
    }
}