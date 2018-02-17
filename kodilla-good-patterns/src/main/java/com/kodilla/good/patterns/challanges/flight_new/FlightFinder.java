package com.kodilla.good.patterns.challanges.flight_new;

import java.util.Set;

public class FlightFinder {
    public static void main(String[] args) {
        FlightDirectory theFlightDirectory = new FlightDirectory();

        Set<Flight> fromKatowice = theFlightDirectory.findFlightsFrom("Katowice");
        System.out.println("# possible routes: " + fromKatowice);

        Set<Flight> toNis = theFlightDirectory.findFlightsTo("Rome");
        System.out.println("# possible routes: " + toNis);

        Set<Flight> fromKatowiceToDublin = theFlightDirectory.findFlightFromTo("Katowice", "Warsaw", "Dublin");
        System.out.println("# possible routes: " + fromKatowiceToDublin);

    }
}
