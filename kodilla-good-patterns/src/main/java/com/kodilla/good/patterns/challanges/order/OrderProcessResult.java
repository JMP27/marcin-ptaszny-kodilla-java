package com.kodilla.good.patterns.challanges.order;

import java.util.Objects;

public class OrderProcessResult {
    private final Order order;
    private final boolean isUserInformed;
    private final boolean isOrderStored;

    public OrderProcessResult(Order order, boolean isUserInformed, boolean isOrderStored) {
        this.order = order;
        this.isUserInformed = isUserInformed;
        this.isOrderStored = isOrderStored;
    }

    public Order getOrder() {
        return order;
    }

    public boolean isUserInformed() {
        return isUserInformed;
    }

    public boolean isOrderStored() {
        return isOrderStored;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderProcessResult that = (OrderProcessResult) o;
        return isUserInformed() == that.isUserInformed() &&
                isOrderStored() == that.isOrderStored() &&
                Objects.equals(getOrder(), that.getOrder());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getOrder(), isUserInformed(), isOrderStored());
    }

    @Override
    public String toString() {
        return "OrderProcessResult{" +
                "order=" + order +
                ", isUserInformed=" + isUserInformed +
                ", isOrderStored=" + isOrderStored +
                '}';
    }
}
