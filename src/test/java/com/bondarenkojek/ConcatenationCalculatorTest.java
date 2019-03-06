package com.bondarenkojek;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConcatenationCalculatorTest {
    private Calculator<String> calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new ConcatenationCalculator();
    }

    @Test
    public void calculateCaseOk() throws Exception {
        String expectedResult = "64";
        String actualResult = calculator.calculate("6", "4");
        assertEquals(expectedResult, actualResult);
    }
}