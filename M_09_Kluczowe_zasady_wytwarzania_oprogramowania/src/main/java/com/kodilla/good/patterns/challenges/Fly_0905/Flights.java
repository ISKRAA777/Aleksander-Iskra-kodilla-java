package com.kodilla.good.patterns.challenges.Fly_0905;

import java.util.HashSet;
import java.util.Set;


public class Flights {
    private Set<Flight> listOfFlight = new HashSet<>();


    public Flights() {
        listOfFlight.add(new Flight("Gdansk", "Warszawa"));
        listOfFlight.add(new Flight("Krakow", "Poznan"));
        listOfFlight.add(new Flight("Gdansk", "Wroclaw"));
        listOfFlight.add(new Flight("Poznan", "Warszawa"));
        listOfFlight.add(new Flight("Wroclaw", "Poznan"));
        listOfFlight.add(new Flight("Gdansk", "Warszawa"));
        listOfFlight.add(new Flight("Wroclaw", "Gdansk"));
    }

    public Set<Flight> getListOfFlight() {
        return new HashSet<>(listOfFlight);
    }
}