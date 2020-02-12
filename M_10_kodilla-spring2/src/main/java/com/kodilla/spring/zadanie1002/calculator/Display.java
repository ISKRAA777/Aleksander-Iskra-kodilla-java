package com.kodilla.spring.zadanie1002.calculator;

import org.springframework.stereotype.Component;

@Component
public class Display {
    public void displayValue(double val) {
        System.out.println(val);
    }
}
