package com.kodilla.good.patterns.challanges.order;

import java.time.LocalDate;
import java.util.Objects;

public class Order {
    private final OrderRequest request;
    private final int id;
    private final LocalDate date;

    public Order(OrderRequest request, int id, LocalDate date) {
        this.request = request;
        this.id = id;
        this.date = date;
    }

    public OrderRequest getRequest() {
        return request;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public User getUser() {
        return request.getUser();
    }

    public Product getProduct() {
        return request.getProduct();
    }

    public int getQuantity() {
        return request.getQuantity();
    }

    public double getAmount() {
        return request.getAmount();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return getId() == order.getId() &&
                Objects.equals(getRequest(), order.getRequest()) &&
                Objects.equals(getDate(), order.getDate());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getRequest(), getId(), getDate());
    }

    @Override
    public String toString() {
        return "Order{" +
                "request=" + request +
                ", id=" + id +
                ", date=" + date +
                '}';
    }
}
