package com.kodilla.exception.test;

public class ThirdChallenge {
    public static void main(String[] args){
        Flight katowice = new Flight("Katowice");
        Flight warsaw = new Flight("Warsaw");

        FlightConnection flightConnection = new FlightConnection();

        try {
            Boolean result = flightConnection.findFlight(katowice);
            System.out.println("we found your connecting flight: " + result);
        } catch (RouteNotFoundException e) {
            System.out.println("we can't find your connecting flight.");
        } finally {
            System.out.println("thank you for using our services.");
        }

    }

}

