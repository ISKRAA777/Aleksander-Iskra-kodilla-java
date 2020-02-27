package com.kodilla.patterns.strategy.social_11_3;

public class Millennials extends User {

    public Millennials(String userName) {
        super(userName);
        this.socialPublisher = new SnapchatPublisher();
    }
}
