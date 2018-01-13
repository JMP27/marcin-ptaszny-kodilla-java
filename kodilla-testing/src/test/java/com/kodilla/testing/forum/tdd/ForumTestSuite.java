package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.*;

public class ForumTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is the begining of tests");
    }

    @AfterClass
    public static void afterAllTests(){
        System.out.println("This is after all tests");
    }

    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddPost(){
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        //When
        forumUser.addPost("mrsmith", "Hello everyone this is my first contribution here");
        //Then
        Assert.assertEquals(1,forumUser.getPostQuantity());
    }

    @Test
    public void testAddComment(){
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost forumPost = new ForumPost("Hello everyone, " + "this is my first contribution here", "mrsmith");

        //When
        forumUser.addComment(forumPost, "mrsmith", "Thank You for all good words!");

        //Then
        Assert.assertEquals(1, forumUser.getCommentsQuantity());
    }

    @Test
    public void testGetPost(){
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost forumPost = new ForumPost("Hello everyone, " + "this is my first contribution here", "mrsmith");
        forumUser.addPost(forumPost.getAuthor(), forumPost.getPostBody());

        //When
        ForumPost retrivedPost = forumUser.getPost(0);

        //Then
        Assert.assertEquals(forumPost,retrivedPost);
    }

    @Test
    public void testGetComment(){
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost forumPost = new ForumPost("Hello everyone, " + "this is my first contribution here", "mrsmith");
        ForumComment theComment = new ForumComment(forumPost, "mrsmith", "Thank You for all good words!");
        forumUser.addComment(forumPost, theComment.getAuthor(), theComment.getCommentBody());

        //When
        ForumComment retrivedComment = forumUser.getComment(0);

        //Then
        Assert.assertEquals(theComment,retrivedComment);
    }

    @Test
    public void testRemovePostNotExisting(){
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost forumPost = new ForumPost("Hello everyone, " + "this is my first contribution here", "mrsmith");

        //When
        boolean result = forumUser.removePost(forumPost);
        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveCommentNotExisting(){
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost forumPost = new ForumPost("Hello everyone, " + "this is my first contribution here", "mrsmith");
        ForumComment forumComment = new ForumComment(forumPost, "mrsmith", "Thank Yoy for all good words!");
        //When
        boolean result = forumUser.removeComment(forumComment);
        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemovePost(){
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost forumPost = new ForumPost("Hello everyone, " + "this is my first contribution here", "mrsmith");
        forumUser.addPost(forumPost.getAuthor(), forumPost.getPostBody());
        //When
        boolean result = forumUser.removePost(forumPost);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0,forumUser.getPostQuantity());
    }

    @Test
    public void testRemoveComment(){
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost forumPost = new ForumPost("Hello everyone, " + "this is my first contribution here", "mrsmith");
        ForumComment forumComment = new ForumComment(forumPost, "mrsmith", "Thank Yoy for all good words!");

        forumUser.addComment(forumPost, forumComment.getAuthor(), forumComment.getCommentBody());
        //When
        boolean result = forumUser.removeComment(forumComment);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0,forumUser.getCommentsQuantity());
    }
}
