package com.kodilla.patterns2.observer.forum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ForumUserTestSuite {
    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEscobar = new ForumUser("Ivone Escobar");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
        javaToolsForum.registerObserver(johnSmith);
        javaToolsForum.registerObserver(jessiePinkman);
        javaHelpForum.registerObserver(ivoneEscobar);
        javaHelpForum.registerObserver(jessiePinkman);
        //When
        javaHelpForum.addPost("Hi everyone! Could you help me with for loop?");
        javaHelpForum.addPost("Better use while loop in this case.");
        javaToolsForum.addPost("Help pls, my mysql db doesn't want to work :(");
        javaHelpForum.addPost("Why while? Is it better?");
        javaToolsForum.addPost("When i try to log in i get 'bad credentials' message...");
        //Then
        assertEquals(2, johnSmith.getUpdateCount());
        assertEquals(3, ivoneEscobar.getUpdateCount());
        assertEquals(5, jessiePinkman.getUpdateCount());
    }
}
