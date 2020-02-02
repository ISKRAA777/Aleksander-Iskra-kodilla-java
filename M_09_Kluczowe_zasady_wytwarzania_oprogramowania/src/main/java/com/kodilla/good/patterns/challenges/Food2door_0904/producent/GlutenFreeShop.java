package com.kodilla.good.patterns.challenges.Food2door_0904.producent;

public class GlutenFreeShop implements Producent {
    private String product;
    private double quantity;

    public GlutenFreeShop(String product, double quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public String product() {
        return product;
    }

    public double quantity() {
        return quantity;
    }

    public boolean process() {
        System.out.println("Order processed for GlutenFreeShop: " + product + ", " + quantity);
        return true;
    }
}
