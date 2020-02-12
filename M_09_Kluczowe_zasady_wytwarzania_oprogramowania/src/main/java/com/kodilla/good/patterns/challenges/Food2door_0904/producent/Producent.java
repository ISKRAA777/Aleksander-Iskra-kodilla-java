package com.kodilla.good.patterns.challenges.Food2door_0904.producent;

public interface Producent {
    // interface odpowiedzialny za tworzenie nowych firm
    String product();

    double quantity();

    boolean process();
}
