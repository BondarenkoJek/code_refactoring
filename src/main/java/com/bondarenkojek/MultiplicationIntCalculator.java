package com.bondarenkojek;

public class MultiplicationIntCalculator implements Calculator<Integer> {
    @Override
    public Integer calculate(Integer a, Integer b) {
        return a * b;
    }
}
