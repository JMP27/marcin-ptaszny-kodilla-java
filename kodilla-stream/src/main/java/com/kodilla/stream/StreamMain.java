package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String args[]){

        Forum forumUserList = new Forum();

        Map<Integer , ForumUser> theResultMapOfUsers = forumUserList.getUserList().stream()
                .filter(forumUser -> forumUser.getUserDate().getYear() < LocalDate.now().getYear() - 20)
                .filter(forumUser -> forumUser.getPostUser() >= 1)
                .filter(forumUser -> forumUser.getSex() == 'M')
                .collect(Collectors.toMap(ForumUser::getId, forum -> forum));

        System.out.println("# Users: " + theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
