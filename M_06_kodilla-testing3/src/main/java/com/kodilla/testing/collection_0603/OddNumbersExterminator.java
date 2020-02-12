package com.kodilla.testing.collection_0603;


import java.util.ArrayList;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

        for (Integer number : numbers) {

            if ((number & 1) == 0) { // alternatywnie (number % 2) == 0
                evenNumbers.add(number);
            }
        }

        return evenNumbers;
    }
}
