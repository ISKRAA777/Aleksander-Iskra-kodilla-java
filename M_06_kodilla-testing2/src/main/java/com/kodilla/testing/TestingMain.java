package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        System.out.println("kodilla testing");
        Calculator calculator = new Calculator();
        double addResult = calculator.add(10, 5);
        double subResult = calculator.sub(10, 5);
        if (addResult == 15) {
            System.out.println("add test ok");
        } else {
            System.out.println("add test failed");
        }
        if (subResult == 5) {
            System.out.println("sub test ok");
        } else {
            System.out.println("sub test failed");
        }
    }
}
