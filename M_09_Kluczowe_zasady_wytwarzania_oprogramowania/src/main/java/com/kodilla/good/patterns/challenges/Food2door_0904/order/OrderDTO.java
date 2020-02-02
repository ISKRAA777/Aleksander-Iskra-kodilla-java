package com.kodilla.good.patterns.challenges.Food2door_0904.order;

public class OrderDTO {


    private String product;
    private double quantity;
    private boolean isOrder;

    public OrderDTO(String product, double quantity, boolean isOrder) {
        this.product = product;
        this.quantity = quantity;
        this.isOrder = isOrder;
    }
}
