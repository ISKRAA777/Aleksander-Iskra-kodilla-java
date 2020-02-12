package com.kodilla.good.patterns.challenges.Food2door_0904.order;


import com.kodilla.good.patterns.challenges.Food2door_0904.producent.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.Food2door_0904.producent.GlutenFreeShop;
import com.kodilla.good.patterns.challenges.Food2door_0904.producent.HealthyShop;
import com.kodilla.good.patterns.challenges.Food2door_0904.producent.Producent;

public class Load {
    //klasa odpoweidzialna za podział zamówień
    //jesli zamowienie bedzie pasować do którejś z firm to "system" wybierze odpowiedznia po nazwie i skompletuje je
    public Producent load(String product, double quantity, String producent) {
        if (producent.trim().toLowerCase().equals(HealthyShop.class.getSimpleName().trim().toLowerCase())) {
            return new HealthyShop(product, quantity);
        } else if (producent.trim().toLowerCase().equals(GlutenFreeShop.class.getSimpleName().trim().toLowerCase())) {
            return new GlutenFreeShop(product, quantity);
        } else {
            return new ExtraFoodShop(product, quantity);
        }
    }
}
