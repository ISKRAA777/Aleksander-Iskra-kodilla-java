package com.kodilla.testing.collection_0603;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        // given stan wejsciowy
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> theList = new ArrayList<>();

        // sekcja when wywołanie testowanej metody
        ArrayList<Integer> result = exterminator.exterminate(theList);

        //sekcja then sprawdzenie wyników działania
        Assert.assertEquals(0,result.size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        // given stan wejsciowy
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> theList = new ArrayList<>();
        theList.add(2);
        theList.add(8);
        theList.add(3);
        theList.add(11);

        // sekcja when wywołanie testowanej metody
        ArrayList<Integer> result = exterminator.exterminate(theList);

        //sekcja then sprawdzenie wyników działania
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(8);
        Assert.assertEquals(expected,result);
    }
}

