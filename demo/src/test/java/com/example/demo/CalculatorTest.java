package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void add(){
        long result = calculator.add(212121, 1);
        assertEquals(result, 212122);
    }

    @Test
    public void subtract(){
        long result = calculator.subtract(5, 100);
        assertEquals(result, -95L);
    }

    @Test
    public void multiply(){
        long result = calculator.multiply(5, 100);
        assertEquals(result, 500);
    }

    @Test
    public void divide(){
        long result = calculator.divide(100, 5);
        assertEquals(result, 20);
    }
    
}
