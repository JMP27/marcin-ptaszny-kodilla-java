package com.kodilla.good.patterns.challanges.food2door;

import java.util.List;

public class ExtraFoodShop implements Producer {

    private List<Product> products;

    public ExtraFoodShop(List<Product> products) {
        this.products = products;
    }

    @Override
    public void process(Product product) {
        System.out.println("Process ExtraFood for product: " + product.getProductName());
    }

}
