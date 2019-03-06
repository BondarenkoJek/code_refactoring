package com.bondarenkojek;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubtractionIntCalculatorTest {
    private Calculator<Integer> calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new SubtractionIntCalculator();
    }

    @Test
    public void calculateCaseOk() throws Exception {
        int expectedResult = 2;
        int actualResult = calculator.calculate(6, 4);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateWithMaxValueCaseOk() throws Exception {
        int expectedResult = Integer.MIN_VALUE;
        int actualResult = calculator.calculate(-1, Integer.MAX_VALUE);
        assertEquals(expectedResult, actualResult);
    }
}