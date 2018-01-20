package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class ForumUser {
    private final int id;
    private final String nameUser;
    private final char sex;
    private final LocalDate userDate;
    private final int postUser;

    public ForumUser(final int id, final String nameUser, final char sex, final LocalDate userDate,final int postUser) {
        this.id = id;
        this.nameUser = nameUser;
        this.sex = sex;
        this.userDate = userDate;
        this.postUser = postUser;
    }

    public int getId() {
        return id;
    }

    public String getNameUser() {
        return nameUser;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getUserDate() {
        return userDate;
    }

    public int getPostUser() {
        return postUser;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", nameUser='" + nameUser + '\'' +
                ", sex=" + sex +
                ", userDate=" + userDate +
                ", postUser=" + postUser +
                '}';
    }
}
