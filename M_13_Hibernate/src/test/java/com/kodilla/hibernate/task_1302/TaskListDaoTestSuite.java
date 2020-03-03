package com.kodilla.hibernate.task_1302;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByListName() {
//Given
        TaskList taskList1 = new TaskList("To do", "First description");
        TaskList taskList2 = new TaskList("To do", "Second description");

//When
        taskListDao.save(taskList1);
        taskListDao.save(taskList2);

//Then
        List<TaskList> readTaskList = taskListDao.findByListName("To do");

        Assert.assertEquals(2, readTaskList.size());
        Assert.assertEquals("To do", readTaskList.get(0).getListName());
        Assert.assertEquals("To do", readTaskList.get(1).getListName());

//CleanUp
        taskListDao.delete(taskList1);
        taskListDao.delete(taskList2);
    }
}

