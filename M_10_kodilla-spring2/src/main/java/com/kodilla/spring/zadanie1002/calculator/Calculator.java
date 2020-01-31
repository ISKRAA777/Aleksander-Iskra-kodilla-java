package com.kodilla.spring.zadanie1002.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    private Display display;
    //metoda add
    public double add(double a, double b ){
        double result = a + b;
        display.displayValue(result);
        return result;
    }

    //metoda sub(odejmowanie)
    public double sub(double a , double b ){
        double result = a - b;
        display.displayValue(result);
        return result;

    }
    //kolejna metoda mnozenie (mul)
    public double mul(double a , double b ){
        double result = a * b;
        display.displayValue(result);
        return result;
    }
    //kolejna 4 klasa div
    public double div(double a , double b ){
        double result = a / b;
        display.displayValue(result);
        return result;

    }
}
