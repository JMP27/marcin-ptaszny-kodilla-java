package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CourseworkTestSuite {
    @Test
    public void testUpdate() {
        //Given
        Coursework javaApiHomework = new JavaApiHomework();
        Coursework javaPatternsHomework = new JavaPatternsHomework();
        Mentor zenekBurczymucha = new Mentor("zenek");
        Mentor grzegorzLeniuchowaty = new Mentor("grzegorz");
        Mentor jorgPracowity = new Mentor("jorg");
        javaApiHomework.registerObserver(zenekBurczymucha);
        javaApiHomework.registerObserver(grzegorzLeniuchowaty);
        javaPatternsHomework.registerObserver(jorgPracowity);
        javaPatternsHomework.registerObserver(zenekBurczymucha);
        //When
        javaApiHomework.addAssignment("new assignment ready to check :)");
        javaApiHomework.addAssignment("ready homework");
        javaPatternsHomework.addAssignment("coursework ready");
        //Then
        assertEquals(3, zenekBurczymucha.getUpdateCount());
        assertEquals(2, grzegorzLeniuchowaty.getUpdateCount());
        assertEquals(1, jorgPracowity.getUpdateCount());
    }
}
