package com.kodilla.good.patterns.challenges.ProductOrderService_0902.service;


import com.kodilla.good.patterns.challenges.ProductOrderService_0902.Product;
import com.kodilla.good.patterns.challenges.ProductOrderService_0902.User;


public interface OrderService {
    boolean order(User user, Product product);
}
