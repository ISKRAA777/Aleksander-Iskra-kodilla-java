package com.kodilla.patterns.strategy.social_11_3;

public class SnapchatPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Snapchat";
    }
}

