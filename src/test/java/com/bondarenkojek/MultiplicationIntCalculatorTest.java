package com.bondarenkojek;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplicationIntCalculatorTest {
    private Calculator<Integer> calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new MultiplicationIntCalculator();
    }

    @Test
    public void calculateCaseOk() throws Exception {
        int expectedResult = 24;
        int actualResult = calculator.calculate(6, 4);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateWithMaxValueCaseOk() throws Exception {
        int expectedResult = -2;
        int actualResult = calculator.calculate(Integer.MAX_VALUE, 2);
        assertEquals(expectedResult, actualResult);
    }
}