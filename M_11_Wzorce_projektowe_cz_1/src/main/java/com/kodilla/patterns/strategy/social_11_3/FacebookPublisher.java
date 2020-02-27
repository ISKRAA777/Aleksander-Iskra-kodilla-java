package com.kodilla.patterns.strategy.social_11_3;

public class FacebookPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Facebook";
    }
}
