package com.kodilla.good.patterns.challenges.Fly_0902;

import java.util.Set;
import java.util.stream.Collectors;

public class Search {

  //System mimo samego przetrzymywania lotów powinien zawierać serwis, który pozwoliłby nam operację związane z
// wyszukiwaniem lotów jak:
    private Flights flight = new Flights();

    //1.	Znalezienie wszystkich lotów z podanego miasta
    public void searchTo(String nameAirPort) {
    flight.getListOfFlight().stream() // otwierasz steam
                .filter(list-> list.getNameAirPortTo().equals(nameAirPort)) //filtrujesz z listy i sprawdzasz czy jakiś
                .forEach(System.out::println);                              //port lotniczy pasuje do przyjmowanego argumentu
    }                                                                       // jesli tak to drukujesz
    //2.	Znalezienie wszystkich lotów do danego miasta
    public void searchFrom(String nameAirPort) {                            //adekwatna sytuacja tylko w drugą stronę
        flight.getListOfFlight().stream()
                .filter(list-> list.getNameAirPortFrom().equals(nameAirPort))
                .forEach(System.out::println);
    }
    //3.	Znalezienie lotów poprzez inne miasto np. lot z Gdańska przez Kraków do Wrocławia
    public void searchThrough(String nameAirPort1, String nameAirPort2) {
        Set<Flight> list1 = flight.getListOfFlight().stream()           //otwierasz steam
                .filter(list -> list.getNameAirPortFrom().equals(nameAirPort1)) //  tutaj robisz bardzo podobnie jak w metodzie
                .collect(Collectors.toSet());                                   //searchTo lecz zapisujesz wynik do setu

        Set<Flight> list2 = flight.getListOfFlight().stream()                   //adekwatnia sytuacja
                .filter(list -> list.getNameAirPortTo().equals(nameAirPort2))
                .collect(Collectors.toSet());

        for(Flight flight1 : list1){                                    //otwierasz pętle z list1
            for(Flight flight2 : list2){                                //otwierasz pętle z list2
                if(flight1.getNameAirPortTo().equals(flight2.getNameAirPortFrom())) {   // tutaj porównujesz elementy jeśli któryś
                    System.out.println(flight1);                        //sie zgadza to drukujesz
                    System.out.println(flight2);
                }
            }
        }
    }
}