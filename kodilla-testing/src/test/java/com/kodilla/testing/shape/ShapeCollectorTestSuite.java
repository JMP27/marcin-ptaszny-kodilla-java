package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is the begining of tests");
    }

    @AfterClass
    public static void afterAllTests(){
        System.out.println("This is after all tests");
    }

    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle("Circle", 10);
        Shape triangle = new Triangle("Triangle", 10, 3);


        //When
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);

        //Then
        Assert.assertEquals(true, shapeCollector.figure.contains(circle));
        Assert.assertEquals(2, shapeCollector.figure.size());
    }

    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle("Circle", 10);

        //When
        shapeCollector.removeFigure(circle);

        //Then
        Assert.assertEquals(true,shapeCollector.figure.isEmpty());
    }

    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle("Circle", 10);
        shapeCollector.addFigure(circle);
        //When
        Shape reterived = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(reterived, circle);
    }

    @Test
    public void testShowFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle("Circle", 10);
        Shape triangle = new Triangle("Triangle", 5, 3);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        //When
        shapeCollector.showFigures();

        //Then
        Assert.assertEquals("Triangle", shapeCollector.showFigures());
    }

}
