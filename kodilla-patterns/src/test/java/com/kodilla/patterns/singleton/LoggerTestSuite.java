package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void loggerTestSuite(){

        Logger.getInstance().log("test1");
        Logger.getInstance().log("test2");
        Logger.getInstance().log("test3");

        String logs = Logger.getInstance().getLastLog();
        Assert.assertEquals("test3", logs);
        System.out.println(logs);
    }
}
