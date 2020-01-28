package com.kodilla.exception.Wiedza_o_wyjątkach_0804;

public class Main {

    public static void main(String[] args) {
        Flight flight = new Flight("Chopina", "Berlin");

        Flights flights = new Flights();

        flights.findFilght(flight);
    }
}
