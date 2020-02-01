package com.kodilla.good.patterns.challenges.Food2door_0903.producent;

// firmy  z getterami i setterami a takze z implementacją process

public class ExtraFoodShop implements Producent {
    private String product;
    private double quantity;

    public ExtraFoodShop(String product, double quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public String product() {
        return product;
    }

    @Override
    public double quantity() {
        return quantity;
    }

    public boolean process() {
        System.out.println("Order processed for ExtraFoodShop: " + product + ", " + quantity);
        return true;
    }}

