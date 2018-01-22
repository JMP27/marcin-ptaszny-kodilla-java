package com.kodilla.stream.world;

import org.junit.Test;
import java.math.BigDecimal;

import static org.junit.Assert.*;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //GIVEN - the world with continents
        World world = new World();
        Continent africa = new Continent("Africa");
        Continent asia = new Continent("Asia");
        Continent europe = new Continent("Europe");
        world.addContinent(africa);
        world.addContinent(asia);
        world.addContinent(europe);

        //WHEN - adding countries with their populations
        africa.addCountry(new Country("Nigeria", new BigDecimal("181563000")));
        africa.addCountry(new Country("Ethiopia", new BigDecimal("99391000")));
        africa.addCountry(new Country("Egypt", new BigDecimal("89125000")));
        africa.addCountry(new Country("*The rest of Africa", new BigDecimal("783229000")));
        asia.addCountry(new Country("China", new BigDecimal("1387160730")));
        asia.addCountry(new Country("India", new BigDecimal("1324009090")));
        asia.addCountry(new Country("Indonesia", new BigDecimal("255462000")));
        asia.addCountry(new Country("*The rest of Asia",new BigDecimal("1549685180")));
        europe.addCountry(new Country("Poland", new BigDecimal("38426000")));
        europe.addCountry(new Country("Russia", new BigDecimal("144031000")));
        europe.addCountry(new Country("Germany", new BigDecimal("81459000")));
        europe.addCountry(new Country("Turkey", new BigDecimal("79817849")));
        europe.addCountry(new Country("*The rest of Europe", new BigDecimal("496289956")));


        //THEN
        assertEquals(new BigDecimal("6509648805"), world.getPeopleQuantity());
    }
}