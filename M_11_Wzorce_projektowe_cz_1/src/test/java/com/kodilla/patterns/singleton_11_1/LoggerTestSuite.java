package com.kodilla.patterns.singleton_11_1;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testLogger(){
        // tworzymy instancję loggera
        Logger logger = Logger.getInstance();
        logger.log("test");
        // asercja
        Assert.assertEquals("test" , logger.getLastLog());
    }
}