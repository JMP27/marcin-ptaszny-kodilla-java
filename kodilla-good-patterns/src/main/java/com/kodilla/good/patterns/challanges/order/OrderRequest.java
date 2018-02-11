package com.kodilla.good.patterns.challanges.order;

import java.util.Objects;

public class OrderRequest {
    private final User user;
    private final Product product;
    private final int quantity;
    private final double amount;

    public OrderRequest(User user, Product product, int quantity) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
        this.amount = product.getPrice() * quantity;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderRequest that = (OrderRequest) o;
        return getQuantity() == that.getQuantity() &&
                Double.compare(that.getAmount(), getAmount()) == 0 &&
                Objects.equals(getUser(), that.getUser()) &&
                Objects.equals(getProduct(), that.getProduct());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getUser(), getProduct(), getQuantity(), getAmount());
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "user=" + user +
                ", product=" + product +
                ", quantity=" + quantity +
                ", amount=" + amount +
                '}';
    }
}
