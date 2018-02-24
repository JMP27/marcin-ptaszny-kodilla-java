package com.kodilla.patterns.strategy.social;

public class User {
    final private String name;
    final private String surname;
    final private String login;
    protected SocialPublisher socialPublisher;

    public User( String name, String surname, String login ) {
        this.name = name;
        this.surname = surname;
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getLogin() {
        return login;
    }

    public String sharePost(){
        return socialPublisher.share();
    }

    public void setPostingPreferences(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
