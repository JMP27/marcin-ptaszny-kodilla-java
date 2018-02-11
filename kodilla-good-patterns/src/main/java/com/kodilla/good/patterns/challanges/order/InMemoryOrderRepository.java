package com.kodilla.good.patterns.challanges.order;

public class InMemoryOrderRepository implements OrderRepository {
    @Override
    public boolean create(Order order) {
        // return database.addOrder(order);
        // dummy result
        return true;
    }
}
