package com.kodilla.good.patterns.challenges.Food2door_0904.order;

public class Respository {
    public boolean create(String nameFirm, String product, double quantity) {
        System.out.println("Producent: " + nameFirm + ", Order: " + product + ", Quantity: " + quantity);
        return true;
    }
}
