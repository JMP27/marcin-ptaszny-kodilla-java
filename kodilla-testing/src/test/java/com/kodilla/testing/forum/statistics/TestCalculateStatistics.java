package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockingDetails;
import static org.mockito.Mockito.when;

public class TestCalculateStatistics {

    /*
    gdy liczba użytkowników = 0
    gdy liczba użytkowników = 100
    */

    @Test
    public void testCalculateAdvStatisticsNoPosts(){
    //Given
    Statistics statisticsMock = mock(Statistics.class);
    int posts = 0;
    CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
    when(statisticsMock.postsCount()).thenReturn(posts);

    //When
    calculateStatistics.calculateAdvStatistics();

    //Then
    Assert.assertEquals(0,calculateStatistics.posts);
    }

    @Test
    public void testCalculateAdvStatisticsPosts1000(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int posts = 1000;
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(posts);

        //When
        calculateStatistics.calculateAdvStatistics();

        //Then
        Assert.assertEquals(1000,calculateStatistics.posts);
    }

    @Test
    public void testCalculateAdvStatisticsNoComments(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int comments = 0;
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //When
        calculateStatistics.calculateAdvStatistics();

        //Then
        Assert.assertEquals(0,calculateStatistics.comments);
    }

    @Test
    public void testCalculateAdvStatisticsCommentsLessThenPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int comments = 0;
        int posts = 10;
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        when(statisticsMock.postsCount()).thenReturn(posts);

        //When
        calculateStatistics.calculateAdvStatistics();
        //Then
        Assert.assertTrue(calculateStatistics.comments<calculateStatistics.posts);
    }

    @Test
    public void testCalculateAdvStatisticsCommentsMoreThenPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int comments = 10;
        int posts = 0;
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        when(statisticsMock.postsCount()).thenReturn(posts);

        //When
        calculateStatistics.calculateAdvStatistics();
        //Then
        Assert.assertTrue(calculateStatistics.comments>calculateStatistics.posts);
    }

    @Test
    public void testCalculateAdvStatisticsNoUsers(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(users);

        //When
        calculateStatistics.calculateAdvStatistics();

        //Then
        Assert.assertEquals(0, calculateStatistics.users);
    }

    @Test
    public void testCalculateAdvStatisticsUsersEqual100(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();

        for(int i = 0; i<100;i++){
            users.add(i, "Imie: " + i);
        }

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(users);

        //When
        calculateStatistics.calculateAdvStatistics();

        //Then
        Assert.assertEquals(100, calculateStatistics.users);
    }

}
