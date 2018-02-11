package com.kodilla.good.patterns.challanges.food2door;

import java.util.Objects;

public class Product {
    private final int id;
    private final String name;
    private final double price;
    private final String productType;

    public Product(int id, String name, double price, String productType) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.productType = productType;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getProductType() {
        return productType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return getId() == product.getId() &&
                Double.compare(product.getPrice(), getPrice()) == 0 &&
                Objects.equals(getName(), product.getName()) &&
                Objects.equals(getProductType(), product.getProductType());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), getName(), getPrice(), getProductType());
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", productType='" + productType + '\'' +
                '}';
    }
}
