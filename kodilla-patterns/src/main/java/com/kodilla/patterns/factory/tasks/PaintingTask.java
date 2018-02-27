package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    String taskName;
    String color;
    String whatToPaint;

    public PaintingTask( String taskName, String color, String whatToPaint ) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("Painting task to be executed.");
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public Boolean isTaskExecuted() {
        return true;
    }
}
