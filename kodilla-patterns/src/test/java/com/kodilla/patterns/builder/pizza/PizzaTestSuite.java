package com.kodilla.patterns.builder.pizza;

import org.junit.Assert;
import org.junit.Test;

public class PizzaTestSuite {
    /*@Test
    public void testPizzaNew(){
        //Given
        Pizza pizza = new Pizza("Thin", "Spicy", "Mushrooms", "Onion", "Ham");
        System.out.println(pizza);
        //When
        int howManyIngrediens = pizza.getIngredients().size();
        //Then
        Assert.assertEquals(3,howManyIngrediens);
    }*/

    @Test
    public void pizzaTestSuite(){
        //Given
        Pizza pizza = new Pizza.PizzaBuilder()
                .ingredient("Onion")
                .bottom("Thin")
                .sauce("Spicy")
                .ingredient("Ham")
                .ingredient("Mushrooms")
                .build();
        System.out.println(pizza);
        //When
        int howManyIngredients = pizza.getIngredients().size();
        //Then
        Assert.assertEquals(3,howManyIngredients);

    }
}
