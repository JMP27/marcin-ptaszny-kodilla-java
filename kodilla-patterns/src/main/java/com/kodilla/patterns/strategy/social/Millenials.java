package com.kodilla.patterns.strategy.social;

public class Millenials extends User{
    public Millenials( String name, String surname, String login ) {
        super(name, surname, login);
        this.socialPublisher = new FacebookPublisher();
    }
}
