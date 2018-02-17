package com.kodilla.good.patterns.challanges.flight_new;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class FlightDirectory {
    private final Set<Flight> flightConnections = new HashSet<>();

    public FlightDirectory() {
        flightConnections.add(new Flight("Katowice", "Warsaw"));
        flightConnections.add(new Flight("Katowice", "Dortmund"));
        flightConnections.add(new Flight("Katowice", "Rome"));
        flightConnections.add(new Flight("Warsaw", "Dubai"));
        flightConnections.add(new Flight("Warsaw", "Dublin"));
        flightConnections.add(new Flight("Warsaw", "Barcelona"));
        flightConnections.add(new Flight("Frankfurt", "Creta"));
        flightConnections.add(new Flight("Milan", "NYC"));
    }
    public Set<Flight> getSet() {
        return new HashSet<>(flightConnections);
    }

    public Set<Flight> findFlightFromTo(String fromCity, String byCity, String toCity) {

        Flight flightFrom = flightConnections.stream()
                .filter(f -> f.getFlightFrom().equals(fromCity))
                .filter(f -> f.getFlightTo().equals(byCity))
                .findFirst().get();

        Flight flightTo = flightConnections.stream()
                .filter(f -> f.getFlightFrom().equals(byCity))
                .filter(f -> f.getFlightTo().equals(toCity))
                .findFirst().get();

        HashSet<Flight> flights = new HashSet<>();
        flights.add(flightFrom);
        flights.add(flightTo);

        return flights;
    }

    public Set<Flight> findFlightsFrom(String fromCity) {
        return flightConnections.stream()
                .filter(f -> f.getFlightFrom().equals(fromCity))
                .collect(Collectors.toSet());
    }
    public Set<Flight> findFlightsTo(String toCity) {
        return flightConnections.stream()
                .filter(f -> f.getFlightTo().equals(toCity))
                .collect(Collectors.toSet());
    }
}