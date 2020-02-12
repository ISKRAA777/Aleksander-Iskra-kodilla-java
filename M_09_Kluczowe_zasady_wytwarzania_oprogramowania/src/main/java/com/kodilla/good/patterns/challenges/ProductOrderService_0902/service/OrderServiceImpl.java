package com.kodilla.good.patterns.challenges.ProductOrderService_0902.service;

import com.kodilla.good.patterns.challenges.ProductOrderService_0902.Product;
import com.kodilla.good.patterns.challenges.ProductOrderService_0902.User;

public class OrderServiceImpl implements OrderService {
    public boolean order(User user, Product product) {
        return user.getMoney() > product.getPrice();
    }
}
