package com.kodilla.good.patterns.challanges.food2door;

import java.util.List;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        List<Product> theList = new ArrayList<>();

        Order orderItem = new Order(new Product("organic berries", 4), 10);

        HealthyShop healthyShop = new HealthyShop(theList);
        OrderProcessor orderProcessor = new OrderProcessor(healthyShop);
        orderProcessor.process(orderItem);
        System.out.println("the total of the order is " + orderItem.getValue() + " zloty");
    }
}

