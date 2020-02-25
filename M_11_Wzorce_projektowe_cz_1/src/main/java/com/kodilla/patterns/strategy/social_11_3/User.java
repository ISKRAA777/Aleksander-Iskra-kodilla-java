package com.kodilla.patterns.strategy.social_11_3;

public class User {

    final private String userName;
    protected SocialPublisher socialPublisher;

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setSocialPublisher (SocialPublisher socialPublisher){
        this.socialPublisher = socialPublisher;
    }

    public String sharePost(){
        return socialPublisher.share();
    }
}

public class Millennials extends User {

    public Millennials(String userName) {
        super(userName);
        this.socialPublisher = new SnapchatPublisher();
    }
}
YGeneration
public class YGeneration extends User {

    public YGeneration(String userName) {
        super(userName);
        this.socialPublisher = new TwitterPublisher();
    }
}
ZGeneration

public class ZGeneration extends User {

    public ZGeneration(String userName) {
        super(userName);
        this.socialPublisher = new FacebookPublisher();
    }
}

public interface SocialPublisher {
    String share();
}

public class FacebookPublisher implements SocialPublisher {

    @Override
    public String share() {
        return "Facebook";
    }
}

public class SnapchatPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Snapchat";
    }
}

public class TwitterPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Twitter";
    }
}

