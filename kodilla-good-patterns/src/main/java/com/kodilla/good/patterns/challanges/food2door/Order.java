package com.kodilla.good.patterns.challanges.food2door;

import java.time.LocalDateTime;

public class Order {
    private final Product product;
    private final double quantity;
    private boolean isSent;

    public Order( Product product, double quantity ) {
        this.product = product;
        this.quantity = quantity;
        this.isSent = false;
    }

    public Product getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getValue() {
        return product.getProductPrice() * quantity;
    }
}