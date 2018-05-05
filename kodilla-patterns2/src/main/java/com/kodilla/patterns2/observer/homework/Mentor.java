package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(Coursework coursework) {
        System.out.println(username + ": New assignment in subject " + coursework.getName() + "\n" +
                " (total: " + coursework.getAssignments().size() + " assignment/s to check");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}