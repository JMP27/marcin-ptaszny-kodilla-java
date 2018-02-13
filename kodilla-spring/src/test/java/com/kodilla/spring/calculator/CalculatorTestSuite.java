package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double resultOfAdd = calculator.add(2,2);
        double resultOfSub = calculator.sub(4,2);
        double resultOfMul = calculator.mul(2,2);
        double resultOfDiv = calculator.div(2,2);
        //Then
        Assert.assertEquals(4.0,resultOfAdd, 0.0);
        Assert.assertEquals(2.0,resultOfSub,0.0);
        Assert.assertEquals(4.0,resultOfMul, 0.0);
        Assert.assertEquals(1.0,resultOfDiv, 0.0);


    }

}
