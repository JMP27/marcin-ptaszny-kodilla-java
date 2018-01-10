package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String args[]){

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")){
            System.out.println("Test OK");
        }else{
            System.out.println("Error");
        }

        //Second test

        Calculator calculator = new Calculator();

        int add = calculator.add(1,1);
        int sub = calculator.sub(2,1);

        System.out.println("Sum Test: " + add);
        System.out.println("Subtract Test: " + sub);
    }
}
