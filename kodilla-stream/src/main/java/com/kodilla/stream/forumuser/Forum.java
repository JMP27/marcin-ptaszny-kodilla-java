package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    List<ForumUser> forumUserList = new ArrayList<>();

    public Forum(){
        forumUserList.add(new ForumUser(0001,"Marcin", 'M', LocalDate.of(1980,12,11), 10));
        forumUserList.add(new ForumUser(0002,"Ania", 'F', LocalDate.of(1983,11,3), 1));
        forumUserList.add(new ForumUser(0003,"Kuba", 'M', LocalDate.of(2005,5,5), 5));
        forumUserList.add(new ForumUser(0004,"Maja", 'F', LocalDate.of(2011,10,6), 2));
    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(forumUserList);
    }

}
