package com.kodilla.testing.forum.statistics;

/*obliczającą następujące statystyki:

        Ilość użytkowników - 10
        Ilość postów - 1000
        Ilość komentarzy
        Średnia ilość postów na użytkownika
        Średnia ilość komentarzy na użytkownika
        Średnia ilość komentarzy na post

*/

import java.util.ArrayList;
import java.util.List;

public class CalculateStatistics {

    Statistics statistics;

    int users = 0;
    int posts = 0;
    int comments = 0;
    int avaregePostPerUser = 0;
    int avaregeCommentPerUser = 0;
    int avaregeCommentPerPost = 0;

    public CalculateStatistics(Statistics statistics){
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(){
        users = statistics.usersNames().size();
        posts = statistics.postsCount();
        comments = statistics.commentsCount();

        if (posts !=0) {
            avaregePostPerUser = users / posts;
            avaregeCommentPerPost = comments / posts;
        }
        if (users !=0) {
            avaregeCommentPerUser = comments / users;
        }
    }

    public void showStatistics(){
        System.out.println(avaregeCommentPerPost);
        System.out.println(avaregeCommentPerUser);
        System.out.println(avaregePostPerUser);
    }
}
