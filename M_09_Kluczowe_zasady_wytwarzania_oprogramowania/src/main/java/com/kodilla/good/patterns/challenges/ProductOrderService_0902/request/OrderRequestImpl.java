package com.kodilla.good.patterns.challenges.ProductOrderService_0902.request;

import com.kodilla.good.patterns.challenges.ProductOrderService_0902.Product;
import com.kodilla.good.patterns.challenges.ProductOrderService_0902.User;

import java.time.LocalDateTime;

public class OrderRequestImpl {

    public OrderRequest retrieve(User user, Product product) {
        LocalDateTime orderFrom = LocalDateTime.now();
        String deliver = "DHL";
        return new OrderRequest(user, orderFrom, deliver, product);
    }
}
