package com.kodilla.patterns.strategy.social_11_3;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {

//Given
        User millennials = new Millennials("Damian");
        User zGeneration = new ZGeneration("Aleksander");
        User yGeneration = new YGeneration("Michał");

//When
        String snapchat = millennials.sharePost();
        String twitter = yGeneration.sharePost();
        String facebook = zGeneration.sharePost();

//Then
        Assert.assertEquals("Snapchat", snapchat);
        Assert.assertEquals("Twitter", twitter);
        Assert.assertEquals("Facebook", facebook);
    }

    @Test
    public void testIndividualSharingStrategy() {

//Given
        User millennials = new Millennials("Adam");
        millennials.setSocialPublisher(new FacebookPublisher());

//When
        String facebook = millennials.sharePost();

//Then
        Assert.assertEquals("Facebook", facebook);
    }
}