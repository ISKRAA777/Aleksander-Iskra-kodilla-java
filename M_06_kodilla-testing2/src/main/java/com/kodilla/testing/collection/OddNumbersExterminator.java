package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        // return null;   to było potrzebne do utworzenia testow ; teraz
        // zastpujemy to poniższym
        // utworzenie pustej listy
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

        // przebieganie elementów z listy z argumentu funkcji
        for (Integer number: numbers) {
            // jesli liczba number jest parzysta (w notacji
            // binarnej na ostatnim bicie ma 0)
            if ((number & 1) == 0) { // alternatywnie (number % 2) == 0
                evenNumbers.add(number); // dodanie liczby do listy
            }
        }

        return evenNumbers; // zwrocenie listy liczb parzystych
    }
}


