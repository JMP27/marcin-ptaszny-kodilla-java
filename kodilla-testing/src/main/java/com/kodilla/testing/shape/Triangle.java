package com.kodilla.testing.shape;

public class Triangle implements Shape{
    private String name = null;
    private int aVariable = 0;
    private int hVariable = 0;

    public Triangle(String name, int aVariableVariable, int hVariable) {
        this.name = name;
        this.aVariable = aVariable;
        this.hVariable = hVariable;
    }

    public String getShapeName() {
        return name;
    }

    public double getField(){
        return (aVariable * hVariable)/2;
    }

}

