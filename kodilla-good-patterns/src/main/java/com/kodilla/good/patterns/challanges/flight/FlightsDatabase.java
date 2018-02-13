package com.kodilla.good.patterns.challanges.flight;

import java.time.LocalDate;
import java.util.Set;

public interface FlightsDatabase {
    public Set<Airport> getAirports();
    public Set<Flight> getFlights(LocalDate date);
}
