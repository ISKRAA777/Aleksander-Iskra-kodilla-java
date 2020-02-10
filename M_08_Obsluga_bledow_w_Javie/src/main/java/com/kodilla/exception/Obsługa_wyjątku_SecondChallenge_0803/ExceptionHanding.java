package com.kodilla.exception.Obsługa_wyjątku_SecondChallenge_0803;

public class ExceptionHanding {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(2,4);
        } catch (Exception e) {
            System.out.println("error !!!");
        }
    }
}
