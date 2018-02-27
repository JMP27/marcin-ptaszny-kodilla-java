package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task addNewTask( final String taskClass ) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("shopping list", "olives", 12);
            case PAINTINGTASK:
                return new PaintingTask("debenhams job", "yellow", "main door");
            case DRIVINGTASK:
                return new DrivingTask("delivery of grapes", "bond street", "vehicle 201");
            default:
                return null;
        }
    }
}
