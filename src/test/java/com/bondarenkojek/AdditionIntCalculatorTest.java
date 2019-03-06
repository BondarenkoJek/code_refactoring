package com.bondarenkojek;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class AdditionIntCalculatorTest {
    private Calculator<Integer> calculator;

    @Before
    public void setUp() throws Exception {
       calculator = new AdditionIntCalculator();
    }

    @Test
    public void calculateCaseOk() throws Exception {
        int expectedResult = 10;
        int actualResult = calculator.calculate(6, 4);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateWithMaxValueCaseOk() throws Exception {
        int expectedResult = Integer.MIN_VALUE;
        int actualResult = calculator.calculate(Integer.MAX_VALUE, 1);
        assertEquals(expectedResult, actualResult);
    }
}