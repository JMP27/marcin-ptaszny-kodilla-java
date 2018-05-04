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
        TaskFinancialDetails save = taskFinancialDetailsDao.save(taskFinancialDetails);

        //When
        List<TaskFinancialDetails> resultList = taskFinancialDetailsDao.findByPaid(false);
        //Then
        Assert.assertEquals(1,resultList.size());

        //CleanUp
        taskFinancialDetailsDao.delete(save.getId());
    }

    @Test
    public void testTaskDaoSaveWithFinancialDetails() {
        //Given
        Task task = new Task("TEST", 30);
        task.setTaskFinancialDetails(new TaskFinancialDetails(new BigDecimal(120), false));
        //When
        Task save = taskDao.save(task);

        //Then
        Assert.assertNotEquals(0,save.getId());
        //CleanUp
        taskDao.delete(save.getId());

    }
}
