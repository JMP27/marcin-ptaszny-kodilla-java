package com.kodilla.good.patterns.challanges.food2door;

public class OrderProcessor {
    private Producer producer;

    public OrderProcessor(Producer producer) {
        this.producer = producer;
    }

    public Order process(Order orderItem) {
        producer.process(orderItem.getProduct());
        return orderItem;
    }

}
