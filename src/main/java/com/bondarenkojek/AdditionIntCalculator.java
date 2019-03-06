package com.bondarenkojek;

public class AdditionIntCalculator implements Calculator<Integer> {
    @Override
    public Integer calculate(Integer a, Integer b) {
        return a + b;
    }
}
