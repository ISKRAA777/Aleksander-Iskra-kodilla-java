package com.kodilla.patterns.strategy.social_11_3;

public class ZGeneration extends User {

    public ZGeneration(String userName) {
        super(userName);
        this.socialPublisher = new FacebookPublisher();
    }
}}
