package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Coursework implements Observable {
    private final List<Observer> observers;
    private final ArrayDeque<String> assignments;
    private final String name;

    public Coursework(String name) {
        observers = new ArrayList<>();
        assignments = new ArrayDeque<>();
        this.name = name;
    }

    public void addAssignment(String assignment) {
        assignments.offer(assignment);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public ArrayDeque<String> getAssignments() {
        return assignments;
    }

    public String getName() {
        return name;
    }
}
