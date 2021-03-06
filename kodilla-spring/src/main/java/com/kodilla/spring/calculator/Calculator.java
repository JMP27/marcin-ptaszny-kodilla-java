package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    private Display display;

    @Autowired
    public Calculator( Display display ) {
        this.display = display;
    }

    public double add(double a, double b){
        double val = a + b;
        display.displayValue(val);
        return val;
    };

    public double sub(double a, double b){
        double val = a - b;
        display.displayValue(val);
        return val;
    };

    public double mul(double a, double b){
        double val = a * b;
        display.displayValue(val);
        return val;
    };

    public double div(double a, double b){
        if (b != 0) {
            double val = a / b;
            display.displayValue(val);
            return val;
        }else{
            System.out.println("The b parameter can be 0!!!");
        }
        return 0;
    };
}
