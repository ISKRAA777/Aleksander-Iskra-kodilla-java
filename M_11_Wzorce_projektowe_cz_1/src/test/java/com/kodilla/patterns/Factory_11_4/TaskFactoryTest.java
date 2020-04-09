package com.kodilla.patterns.Factory_11_4;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTest {
    @Test

    public void testMakeShoppingTask() {
//Given
        TaskFactory taskFactory = new TaskFactory();
//When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING,
                "My list",
                "carrots",
                "3.3");
        boolean beforeExecution = shopping.isTaskExecuted();
        shopping.executeTask();
//Then
        Assert.assertEquals("My list", shopping.getTaskName());
        Assert.assertFalse(beforeExecution);
        Assert.assertTrue(shopping.isTaskExecuted());

    }

    @Test
    public void testMakePaintingTask() {
//Given
        TaskFactory taskFactory = new TaskFactory();
//When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING,
                "My task", "green", "my house");
        boolean beforeExecution = painting.isTaskExecuted();
        painting.executeTask();
//Then
        Assert.assertEquals("My task", painting.getTaskName());
        Assert.assertFalse(beforeExecution);
        Assert.assertTrue(painting.isTaskExecuted());
    }

    @Test

    public void testMakeDrivingTask() {
//Given
        TaskFactory taskFactory = new TaskFactory();
//When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING,
                "My driving", "green", "painiting car");
        boolean beforeExecution = driving.isTaskExecuted();
        driving.executeTask();
//Then
        Assert.assertEquals("My driving", driving.getTaskName());
        Assert.assertFalse(beforeExecution);
        Assert.assertTrue(driving.isTaskExecuted());
    }

    @Test
    public void testNullTask() {
//Given
        TaskFactory taskFactory = new TaskFactory();
//When
        Task nullTask = taskFactory.makeTask("Null",
                "null", "", "");
//Then
        Assert.assertNull(nullTask);
    }
}