package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public final class BigmacTestSuite {
    @Test
    public void testBigmacNew(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .sauce("sauce")
                .burgers(2)
                .roll("roll")
                .ingredient("Ham")
                .ingredient("Mushrooms")
                .ingredient("Salat").build();
        System.out.println(bigmac);
        //When
        int howManyingredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(3,howManyingredients);


    }

}

