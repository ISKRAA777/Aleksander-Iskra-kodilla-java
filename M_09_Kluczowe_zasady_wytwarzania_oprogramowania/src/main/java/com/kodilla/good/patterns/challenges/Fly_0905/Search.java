package com.kodilla.good.patterns.challenges.Fly_0905;

import java.util.Set;
import java.util.stream.Collectors;

public class Search {

    private Flights flight = new Flights();

    public void searchTo(String nameAirPort) {
    flight.getListOfFlight().stream()
                .filter(list-> list.getNameAirPortTo().equals(nameAirPort))
                .forEach(System.out::println);
    }

    public void searchFrom(String nameAirPort) {
        flight.getListOfFlight().stream()
                .filter(list-> list.getNameAirPortFrom().equals(nameAirPort))
                .forEach(System.out::println);
    }


    public void searchThrough(String nameAirPort1, String nameAirPort2) {
        Set<Flight> list1 = flight.getListOfFlight().stream()
                .filter(list -> list.getNameAirPortFrom().equals(nameAirPort1))
                .collect(Collectors.toSet());

        Set<Flight> list2 = flight.getListOfFlight().stream()
                .filter(list -> list.getNameAirPortTo().equals(nameAirPort2))
                .collect(Collectors.toSet());

        for(Flight flight1 : list1){
            for(Flight flight2 : list2){
                if(flight1.getNameAirPortTo().equals(flight2.getNameAirPortFrom())) {
                    System.out.println(flight1);
                    System.out.println(flight2);
                }
            }
        }
    }
}