package com.kodilla.patterns.strategy.social_11_3;

public class User {
final private String userName;
protected SocialPublisher socialPublisher;

public User(String userName){
        this.userName=userName;
        }

public String getUserName(){
        return userName;
        }

public void setSocialPublisher(SocialPublisher socialPublisher){
        this.socialPublisher=socialPublisher;
        }

public String sharePost(){
        return socialPublisher.share();
        }
}
