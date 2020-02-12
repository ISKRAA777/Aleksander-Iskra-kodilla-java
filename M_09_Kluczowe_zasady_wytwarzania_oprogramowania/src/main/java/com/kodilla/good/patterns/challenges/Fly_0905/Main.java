package com.kodilla.good.patterns.challenges.Fly_0905;

public class Main {
    public static void main(String[] args) {


        Search search = new Search();
        search.searchFrom( "Poznan");
        search.searchTo("Gdansk");
        search.searchThrough( "Wroclaw", "Warszawa");

    }
}
