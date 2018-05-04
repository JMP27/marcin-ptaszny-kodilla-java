package com.kodilla.hibernate.manytomany.facade;


public class SearchServiceException extends Exception {
    public static String ERR_NOPERSON_ERROR = "Cannot find the employee";
    public static String ERR_NOCOMPANY_ERROR = "Cannot find the company";

    public SearchServiceException(String message) {
        super(message);
    }
}
