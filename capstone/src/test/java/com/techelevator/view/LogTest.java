package com.techelevator.view;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

public class LogTest {

    private Log TestLog;

    @Before
    public void setup() {
        TestLog = new Log();
    }

    @Test
    public void checkingTheLog_Test() {
        File destinationFile = new File("Log.txt");
        TestLog.writeToLog(3.50, "pretend method for test", 4.50, destinationFile);
        TestLog.writeToLog(5.0, "Another pretender", 0.00, destinationFile);
    }

    @Test
    public void LogTryCatch_Test() {
        File destinationFile = new File("incorrectFileName:");
        TestLog.writeToLog(5.50, "pretend method for test", 8.50, destinationFile);
        TestLog.writeToLog(8.0, "Another pretender", 3.00, destinationFile);
        Assert.assertEquals("The file was not found: C:\\Users\\Student\\workspace\\Mod 1 Capstone\\module-1-capstone-team-4\\capstone\\incorrectFileName:", TestLog.writeToLog(5.50, "pretend method for test", 8.50, destinationFile));
    }
}
