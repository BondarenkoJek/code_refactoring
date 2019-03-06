package com.bondarenkojek;

public class Main {

    public static void main(String[] args) throws Exception {
        Calculator add = new AdditionIntCalculator();
        Calculator sub = new SubtractionIntCalculator();
        Calculator multi = new MultiplicationIntCalculator();
        Calculator div = new DivisionIntCalculator();

        Calculator concat = new ConcatenationCalculator();

        System.out.println("result is :" + add.calculate(6, 4));
        System.out.println("result is :" + sub.calculate(6, 4));
        System.out.println("result is :" + multi.calculate(6, 4));
        System.out.println("result is :" + div.calculate(6, 4));
        System.out.println("result is :" + concat.calculate("6", "4"));
    }
}
