package com.kodilla.exception.test;

public class ExceptionHandling{
    public static void main(String[] args){
        SecondChallenge secondChallenge = new SecondChallenge();
        try{
            System.out.println(secondChallenge.probablyIWillThrowException(3.0, 1.6));
        } catch (Exception e) {
            System.out.println("Error catch: " + e);
        } finally {
            System.out.println("Finish module");
        }
    }
}
