package com.mycompany.calculatorapp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
     Calculator calculator;
    @Before
    public void setup(){
      calculator = new Calculator();
    }

    @Test
    public void testResultForAdd(){
        Double result = calculator.add(23.67,45.90);
        Assert.assertEquals(new Double(69.57),result);
    }

    @Test
    public void testResultForSub(){
        Double result = calculator.sub(33.00,15.00);
        Assert.assertEquals(new Double(18),result);
    }

    @Test
    public void testResultForMultiplication(){
        Double result = calculator.mult(3.00,4.00);
        Assert.assertEquals(new Double(12),result);
    }

    @Test
    public void testResultForDiv(){
        Double result = calculator.div(9.00,3.00);
        Assert.assertEquals(new Double(3.00),result);
    }
}
