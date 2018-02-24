package com.kodilla.patterns.strategy.social;

public class ZGeneration extends User{
    public ZGeneration( String name, String surname, String login ) {
        super(name, surname, login);
        this.socialPublisher = new SnapchatPublisher();
    }
}
