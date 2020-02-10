package com.kodilla.exception.Wiedza_o_wyjątkach_0804;

import java.util.HashMap;
import java.util.Map;

public class Flights {
    private Map<String, Boolean> flightList = new HashMap<>();


    public void findFilght(Flight flight) {
        Map<String, Boolean> airport = new HashMap<>();
        airport.put("Chopina", true);

        if (airport.containsKey(flight.getArrivalAirport())) {
            System.out.println("Arrival airport possible : " + flight.getArrivalAirport());
        } else
            throw new RouteNotFoundException("No such airport");

    }
}
