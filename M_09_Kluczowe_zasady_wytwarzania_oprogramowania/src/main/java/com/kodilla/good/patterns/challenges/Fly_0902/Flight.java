package com.kodilla.good.patterns.challenges.Fly_0902;

import java.util.Objects;
//tworzymy klasę lotów by móc się posługiwać obiektami klasy przy dodawaniu ich do listy lotów, a później do ich
// wyszukiwania

public class Flight {
//dwa pola prywatne skąd i dokąd
    private String nameAirPortFrom;
    private String nameAirPortTo;

//konstruktor by można było uzupełnić pola
    public Flight(String nameAirPortFrom, String nameAirPortTo) {
        this.nameAirPortFrom = nameAirPortFrom;
        this.nameAirPortTo = nameAirPortTo;
    }
//getter i setter
    public String getNameAirPortFrom() {
        return nameAirPortFrom;
    }

    public String getNameAirPortTo() {
        return nameAirPortTo;
    }
//equals i hashCode do porównywania lotów
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return Objects.equals(nameAirPortFrom, flight.nameAirPortFrom) &&
                Objects.equals(nameAirPortTo, flight.nameAirPortTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAirPortFrom, nameAirPortTo);
    }

    @Override
    public String toString() {
        return "AirPortFrom='" + nameAirPortFrom + '\'' +
                ", AirPortTo='" + nameAirPortTo + '\'';
    }
}
