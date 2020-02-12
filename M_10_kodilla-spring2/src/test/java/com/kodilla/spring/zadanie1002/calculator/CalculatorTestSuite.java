package com.kodilla.spring.zadanie1002.calculator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.example.M10.zadanie1002_calculator");
        Calculator calculator = context.getBean(Calculator.class);
        //when
        double add = calculator.add(4, 8);
        double sub = calculator.sub(6, 8);
        double mul = calculator.mul(2, 6);
        double div = calculator.div(18, 9);
        //then ( assercja - sprawdzanie wynikólw)
        Assert.assertEquals(12, add, 0.01);
        Assert.assertEquals(-2, sub, 0.0001);
        Assert.assertEquals(12, mul, 0.01);
        Assert.assertEquals(2, div, 0.1);

    }
}