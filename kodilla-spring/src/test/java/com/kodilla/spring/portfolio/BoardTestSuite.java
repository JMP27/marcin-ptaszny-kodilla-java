package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.toDoList.tasks.add("Task 1");
        board.inProgressList.tasks.add("Task 2");
        board.doneList.tasks.add("Task 3");

        //Then
        Assert.assertEquals("Task 1", board.toDoList.tasks.get(0));
        Assert.assertEquals("Task 2", board.inProgressList.tasks.get(0));
        Assert.assertEquals("Task 3", board.doneList.tasks.get(0));
        System.out.println(board);

    }
}
