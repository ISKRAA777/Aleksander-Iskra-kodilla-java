package com.kodilla.good.patterns.challenges.ProductOrderService_0902.request;

import com.kodilla.good.patterns.challenges.ProductOrderService_0902.Product;
import com.kodilla.good.patterns.challenges.ProductOrderService_0902.User;

import java.time.LocalDateTime;

public class OrderRequest {

    public User user;
    public LocalDateTime from;
    public String delivery;
    public Product product;

    public OrderRequest(final User user, final LocalDateTime from, final String delivery, Product product) {
        this.user = user;
        this.from = from;
        this.delivery = delivery;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public String getDelivery() {
        return delivery;
    }

    public Product getProduct() {
        return product;
    }
}
