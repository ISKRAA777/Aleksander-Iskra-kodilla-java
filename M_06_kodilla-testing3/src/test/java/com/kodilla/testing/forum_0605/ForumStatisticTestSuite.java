package com.kodilla.testing.forum_0605;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticTestSuite {

    private Statistics statisticsMock;
    private ForumStatistic forumStatistics;


    @Before
    public void beforeTest() {
        statisticsMock = mock(Statistics.class);
        List<String> listMock = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listMock.add("User");
        }
        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(40);
        forumStatistics = new ForumStatistic();
    }

    @Test
    public void testCalculateAdvStatisticsWithZeroPosts() {
//Given
        when(statisticsMock.postsCount()).thenReturn(0);
//When
        forumStatistics.calculateAdvStatistics(statisticsMock);
//Then

        assertEquals(10, forumStatistics.getUsers());
        assertEquals(0, forumStatistics.getPosts());
        assertEquals(40, forumStatistics.getComments());
        assertEquals(0.0, forumStatistics.getPostsPerUser(), 0.0);
        assertEquals(4.0, forumStatistics.getCommentsPerUser(), 0.0);
        assertEquals(0, forumStatistics.getCommentsPerPost(), 0.01);

    }

    @Test
    public void testCalculateAdvStatisticsWithThousandPosts() {
//Given
        when(statisticsMock.postsCount()).thenReturn(1000);
//When
        forumStatistics.calculateAdvStatistics(statisticsMock);
//Then
        assertEquals(10, forumStatistics.getUsers());
        assertEquals(1000, forumStatistics.getPosts());
        assertEquals(40, forumStatistics.getComments());
        assertEquals(100, forumStatistics.getPostsPerUser(), 0.01);
        assertEquals(4.0, forumStatistics.getCommentsPerUser(), 0.0);
        assertEquals(0.04, forumStatistics.getCommentsPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsWithZeroComments() {
//Given
        when(statisticsMock.commentsCount()).thenReturn(0);
//When
        forumStatistics.calculateAdvStatistics(statisticsMock);
//Then

        assertEquals(10, forumStatistics.getUsers());
        assertEquals(20, forumStatistics.getPosts());
        assertEquals(0, forumStatistics.getComments());
        assertEquals(2, forumStatistics.getPostsPerUser(), 0.01);
        assertEquals(0, forumStatistics.getCommentsPerUser(), 0.0);
        assertEquals(0.0, forumStatistics.getCommentsPerPost(), 0.01);

    }


    @Test
    public void testCalculateAdvStatisticsLessCommentsThanPosts() {
//Given
        when(statisticsMock.commentsCount()).thenReturn(2);
        when(statisticsMock.postsCount()).thenReturn(10);
//When
        forumStatistics.calculateAdvStatistics(statisticsMock);
//Then
        assertEquals(10, forumStatistics.getUsers());
        assertEquals(10, forumStatistics.getPosts());
        assertEquals(2, forumStatistics.getComments());
        assertEquals(1, forumStatistics.getPostsPerUser(), 0.01);
        assertEquals(0.2, forumStatistics.getCommentsPerUser(), 0.01);
        assertEquals(0.2, forumStatistics.getCommentsPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsMoreCommentsThanPosts() {
//Given & When
        forumStatistics.calculateAdvStatistics(statisticsMock);
//Then
        assertEquals(10, forumStatistics.getUsers());
        assertEquals(20, forumStatistics.getPosts());
        assertEquals(40, forumStatistics.getComments());
        assertEquals(2, forumStatistics.getPostsPerUser(), 0.01);
        assertEquals(4, forumStatistics.getCommentsPerUser(), 0.01);
        assertEquals(2, forumStatistics.getCommentsPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsWithZeroUsers() {
//Given
        List<String> listMock = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(listMock);
//When
        forumStatistics.calculateAdvStatistics(statisticsMock);
//Then
        assertEquals(0, forumStatistics.getUsers());
        assertEquals(20, forumStatistics.getPosts());
        assertEquals(40, forumStatistics.getComments());
        assertEquals(0, forumStatistics.getPostsPerUser(), 0.01);
        assertEquals(0, forumStatistics.getCommentsPerUser(), 0.01);
        assertEquals(2, forumStatistics.getCommentsPerPost(), 0.01);

    }

    @Test
    public void testCalculateAdvStatisticsWithHundredUsers() {
//Given
        List<String> listMock = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            listMock.add("User");
        }
        when(statisticsMock.usersNames()).thenReturn(listMock);
//When
        forumStatistics.calculateAdvStatistics(statisticsMock);
//Then
        assertEquals(100, forumStatistics.getUsers());
        assertEquals(20, forumStatistics.getPosts());
        assertEquals(40, forumStatistics.getComments());
        assertEquals(0.2, forumStatistics.getPostsPerUser(), 0.01);
        assertEquals(0.4, forumStatistics.getCommentsPerUser(), 0.01);
        assertEquals(2, forumStatistics.getCommentsPerPost(), 0.01);

    }
}