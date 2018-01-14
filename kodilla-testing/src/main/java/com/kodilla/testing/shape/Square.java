package com.kodilla.testing.shape;

public class Square implements Shape {
    private String name = null;
    private int firstVariable = 0;


    public Square(String name, int firstVariable) {
        this.name = name;
        this.firstVariable = firstVariable;

    }

    public String getShapeName() {
        return name;
    }

    public double getField(){
        return Math.pow(firstVariable,2);
    }

}
