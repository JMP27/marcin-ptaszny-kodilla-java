package com.kodilla.good.patterns.challanges.order;

public class OrderRequestRetriever {
    private OrderRequest request;
    private int quanity;


    public OrderRequestRetriever() {
        User user = new User(1, "Mar", "Pta", "NY Streat",
                "mar.pta@gmail.com");
        Product product = new Product(1, "Gra Diablo",
                630);
        request = new OrderRequest(user, product, 10);
    }

    public OrderRequest retrieve(User user, Product product) {
        return request = new OrderRequest(user,product, quanity); }
}
