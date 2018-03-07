package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import javafx.scene.canvas.GraphicsContext;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static sun.tools.jconsole.Messages.DESCRIPTION;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskFinancialDetailsDaoTestSuite {
    @Autowired
    TaskFinancialDetailsDao taskFinancialDetailsDao;
    @Autowired
    private TaskDao taskDao;

    @Test
    public void testFindByPaid(){
        //Given
        TaskFinancialDetails taskFinancialDetails = new TaskFinancialDetails(new BigDecimal(115), false);
        taskFinancialDetailsDao.save(taskFinancialDetails);
        int id = taskFinancialDetails.getId();

        //When
        List<TaskFinancialDetails> resultList = taskFinancialDetailsDao.findByPaid(false);
        //Then
        Assert.assertEquals(4,resultList.size());

        //CleanUp
        taskFinancialDetailsDao.delete(id);
    }

    @Test
    public void testTaskDaoSaveWithFinancialDetails() {
        //Given
        Task task = new Task(DESCRIPTION, 30);
        task.setTaskFinancialDetails(new TaskFinancialDetails(new BigDecimal(120), false));
        //When
        taskDao.save(task);
        int id = task.getId();
        //Then
        Assert.assertEquals(5,id);
        //CleanUp
        taskDao.delete(id);

    }
}
