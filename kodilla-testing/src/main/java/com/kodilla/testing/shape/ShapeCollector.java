package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector{
        ArrayList<Shape> figure = new ArrayList<>();

        public void addFigure(Shape shape){
            figure.add(shape);
        }

        public void removeFigure(Shape shape){
            figure.remove(shape);
        }

        public Shape getFigure(int n){
            return figure.get(n);
        }

        public String showFigures(){
            String name = "";
            for(int j = 0; j<figure.size();j++) {
                Shape shape = figure.get(j);
                System.out.println("Name figure: " + figure.get(j).getShapeName() + " Figure Field: " + figure.get(j).getField());
                name += shape.getShapeName();
                //return name;
            }
            return name;
        }
}
