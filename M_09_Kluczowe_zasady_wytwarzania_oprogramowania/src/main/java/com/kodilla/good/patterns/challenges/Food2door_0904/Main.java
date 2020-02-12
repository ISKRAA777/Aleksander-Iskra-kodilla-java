package com.kodilla.good.patterns.challenges.Food2door_0904;

import com.kodilla.good.patterns.challenges.Food2door_0904.order.Load;
import com.kodilla.good.patterns.challenges.Food2door_0904.order.Process;
import com.kodilla.good.patterns.challenges.Food2door_0904.order.Respository;
import com.kodilla.good.patterns.challenges.Food2door_0904.producent.Producent;

public class Main {
    public static void main(String[] args) {


        Load order = new Load();
        Producent producent = order.load("Mars", 20, "HealthyShop");
        Process process = new Process(new Respository());
        process.start(producent);
    }
}
