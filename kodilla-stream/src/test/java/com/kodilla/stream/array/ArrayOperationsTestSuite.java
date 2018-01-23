package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        GetArrayOperations getArrayOperations = new GetArrayOperations();
        int[] numbers = {1,22,3,42,5,36,7,85,9,10};
        //When
        double average = getArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(22.0,average,0);
    }
}
