package com.kodilla.patterns.strategy.social_11_3;

public class TwitterPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Twitter";
    }
}

