package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User martin = new Millenials("M", "P", "MP");
        User anna = new YGeneration("A", "P", "AP");
        User jacob = new ZGeneration("J", "P", "JP");

        //When
        String facebookPreferences = martin.sharePost();
        System.out.println("Martin is a " + facebookPreferences);
        String twitterPreferences = anna.sharePost();
        System.out.println("Anna is a " + twitterPreferences);
        String snapchatPreferences = jacob.sharePost();
        System.out.println("Jacob is a " + snapchatPreferences);

        //Then
        Assert.assertEquals("user of Facebook", facebookPreferences);
        Assert.assertEquals("user of Twitter", twitterPreferences);
        Assert.assertEquals("user of Shapchat" , snapchatPreferences);
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User martin = new Millenials("M", "P", "MP");

        //When
        String martinShouldBe = martin.sharePost();
        System.out.println("Martin is " + martinShouldBe);
        martin.setPostingPreferences(new TwitterPublisher());
        martinShouldBe = martin.sharePost();
        System.out.println("Martin now is " + martinShouldBe);

        //Then
        Assert.assertEquals("user of Twitter", martinShouldBe);

    }
}
