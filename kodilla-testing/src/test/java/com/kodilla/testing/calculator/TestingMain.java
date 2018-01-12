package com.kodilla.testing.calculator;

import org.junit.*;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {


    Calculator calculator = new Calculator();

    @Test
    public void add(){
    int a = calculator.add(2,2);
    if(a == 4) {
        System.out.println("Test Add ok: " + a);
    }


    }

    @Test
    public void sub(){
    int b = calculator.sub(4,2);
    if(b == 2){
        System.out.println("Test Sub ok: " + b);
    }

    }


}
