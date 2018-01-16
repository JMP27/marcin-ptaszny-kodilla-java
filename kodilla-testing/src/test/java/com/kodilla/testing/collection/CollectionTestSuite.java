package com.kodilla.testing.collection;

import javafx.beans.binding.When;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    static int i = 0;

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
        List<Integer> numbers = new ArrayList<>();

        List<Integer> expectedResult = new ArrayList<>();

        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        for(int i = 1; i< 8; i++){
            numbers.add(i);
        }

        expectedResult.add(2);
        expectedResult.add(4);
        expectedResult.add(6);

        //When
        List<Integer> evenNumbers = oddNumbersExterminator.exterminate(numbers);
        System.out.println("Excepted numbers: " + expectedResult);
        System.out.println("Even Numbers: " + evenNumbers);

        //Then
        Assert.assertEquals(expectedResult,evenNumbers);
        i++;
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        List<Integer> numbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();

        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //When
        evenNumbers = oddNumbersExterminator.exterminate(numbers);

        //Then
        Assert.assertTrue(evenNumbers.isEmpty());
        i++;
    }

    @Test
    public void testOneOddNumber(){

        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(11);
        //When
        List<Integer> evenNumbers = oddNumbersExterminator.exterminate(numbers);
        //Then
        Assert.assertTrue(evenNumbers.isEmpty());
        i++;
    }

    @Test
    public void testOneEvenNumber(){

        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        //When
        List<Integer> evenNumbers = oddNumbersExterminator.exterminate(numbers);
        //Then
        Assert.assertEquals(1, evenNumbers.size());
        int a = evenNumbers.get(0);
        Assert.assertEquals(2, a);
        i++;
        System.out.println(i);
    }

}
