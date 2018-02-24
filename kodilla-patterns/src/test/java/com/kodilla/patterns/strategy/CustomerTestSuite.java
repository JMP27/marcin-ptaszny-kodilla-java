package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.predictors.AggressivePredictor;
import org.junit.Assert;
import org.junit.Test;

public class CustomerTestSuite {
    @Test
    public void testDefaultInvestingStrategies(){
        Customer steven = new IndividualCustomer("Steven");
        Customer marcin = new IndividualYoungCustomer("Marcin");
        Customer ania = new CorporateCustomer("Ania");

        String stevenShouldBuy = steven.predict();
        System.out.println("Steven should: " + stevenShouldBuy);

        String marcinShouldBuy = marcin.predict();
        System.out.println("Marcin should buy " + marcinShouldBuy);

        String aniaShouldBuy = ania.predict();
        System.out.println("Ania should buy " + aniaShouldBuy);

        Assert.assertEquals("[Conservative predictor] Buy debentures of XYZ",stevenShouldBuy);
        Assert.assertEquals("[Aggressive predictor] Buy stock of XYZ",marcinShouldBuy);
        Assert.assertEquals("[Balanced predictor] Buy shared units of Fund XYZ", aniaShouldBuy);
    }

    @Test
    public void testIndividualInvestingStrategy() {
        //Given
        Customer steven = new IndividualCustomer("Steven Links");

        //When
        String stevenShouldBuy = steven.predict();
        System.out.println("Steven should: " + stevenShouldBuy);
        steven.setBuyIngStrategy(new AggressivePredictor());
        stevenShouldBuy = steven.predict();
        System.out.println("Steven now should: " + stevenShouldBuy);

        //Then
        Assert.assertEquals("[Aggressive predictor] Buy stock of XYZ", stevenShouldBuy);
    }
}
