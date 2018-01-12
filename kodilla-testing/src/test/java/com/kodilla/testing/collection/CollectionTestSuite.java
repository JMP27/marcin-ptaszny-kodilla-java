package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {


    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> expectedResult = new ArrayList<>();

        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        for(int i = 1; i< 8; i++){
            numbers.add(i);
        }

        expectedResult.add(2);
        expectedResult.add(4);
        expectedResult.add(6);

        //When
        evenNumbers = oddNumbersExterminator.exterminate(numbers);
        System.out.println("Excepted numbers: " + expectedResult);
        System.out.println("Even Numbers: " + evenNumbers);

        //Then
        Assert.assertEquals(expectedResult,evenNumbers);
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //When
        evenNumbers = oddNumbersExterminator.exterminate(numbers);
        System.out.println("Testing when collection array is Null - ok");

        //Then
        Assert.assertEquals(numbers, evenNumbers);
    }


}
