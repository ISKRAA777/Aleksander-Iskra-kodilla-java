package com.kodilla.good.patterns.challenges.Fly_0902;

import java.util.Objects;

public class Flight {
    private String nameAirPortFrom;
    private String nameAirPortTo;

    public Flight(String nameAirPortFrom, String nameAirPortTo) {
        this.nameAirPortFrom = nameAirPortFrom;
        this.nameAirPortTo = nameAirPortTo;
    }

    public String getNameAirPortFrom() {
        return nameAirPortFrom;
    }

    public String getNameAirPortTo() {
        return nameAirPortTo;
    }

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
