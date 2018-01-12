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

        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        numbers.add(4);
        numbers.add(8);
        //When
        evenNumbers.addAll(oddNumbersExterminator.exterminate(numbers));
        System.out.println("Testing when collection have evenNumbers " + evenNumbers);

        //Then
        Assert.assertEquals(evenNumbers, numbers);
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //When
        evenNumbers.addAll(oddNumbersExterminator.exterminate(numbers));
        System.out.println("Testing when collection array is Null - ok");

        //Then
        Assert.assertEquals(numbers, evenNumbers);
    }


}
