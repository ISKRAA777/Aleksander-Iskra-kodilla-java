package com.kodilla.good.patterns.challenges.Food2door_0903.order;

public class        Respository {
// magazyn który 'zwraca zamowienie dla określonej firmy
    public boolean create(String nameFirm, String product, double quantity) {
        System.out.println("Producent: " + nameFirm + ", Order: " + product + ", Quantity: " + quantity);
        return true;
    }
}
