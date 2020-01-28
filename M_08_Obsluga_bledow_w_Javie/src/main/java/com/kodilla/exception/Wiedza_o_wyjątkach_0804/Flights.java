package com.kodilla.exception.Wiedza_o_wyjątkach_0804;

import java.util.HashMap;
import java.util.Map;

public class Flights {
    private Map<String, Boolean> flightList = new HashMap<>();


    public void findFilght(Flight flight){
        flightList.put("Chopina", true);
       for(String s : flightList.keySet()){
           if(!s.equals(flight.getDepartureAirport())){
               throw new RouteNotFoundException("Nie ma takiego lotniska");
           }else{
               System.out.println("Lotnisko "+s);
           }

       }

    }
}
