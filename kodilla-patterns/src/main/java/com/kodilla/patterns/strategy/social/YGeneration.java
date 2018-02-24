package com.kodilla.patterns.strategy.social;

public class YGeneration extends User {
    public YGeneration( String name, String surname, String login ) {
        super(name, surname, login);
        this.socialPublisher = new TwitterPublisher();
    }
}
