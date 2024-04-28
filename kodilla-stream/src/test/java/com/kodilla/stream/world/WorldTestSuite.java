package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", new BigDecimal("38000000"));
        Country germany = new Country("Germany", new BigDecimal("83000000"));
        Country france = new Country("France", new BigDecimal("67000000"));
        Country china = new Country("China", new BigDecimal("1400000000"));
        Country india = new Country("India", new BigDecimal("1350000000"));
        Country japan = new Country("Japan", new BigDecimal("126000000"));
        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);
        asia.addCountry(china);
        asia.addCountry(india);
        asia.addCountry(japan);
        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        //When
        BigDecimal totalPopulation = world.getPeopleQuantity();
        //Then
        BigDecimal expectedPopulation = new BigDecimal("3064000000");
        assertEquals(expectedPopulation, totalPopulation);
    }
}