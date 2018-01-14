package com.kodilla.testing.shape;

import static java.lang.StrictMath.sqrt;

public class Circle implements Shape{
    private String name = null;
    private int radiusVariable = 0;

    public Circle(String name, int radiusVariable){
        this.name = name;
        this.radiusVariable = radiusVariable;
    }

    public String getShapeName(){
        return name;
    }

    public double getField(){
        return Math.PI * Math.pow(radiusVariable,2);
    }

}
