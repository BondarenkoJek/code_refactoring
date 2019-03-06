package com.bondarenkojek;

public class ConcatenationCalculator implements Calculator<String> {
    @Override
    public String calculate(String a, String b) {
        return a + b;
    }
}
