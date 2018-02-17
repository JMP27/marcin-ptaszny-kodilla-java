package com.kodilla.good.patterns.challanges.flight_new;

public final class Flight {
    private final String flightFrom;
    private final String flightTo;

    public Flight(final String flightFrom, final String flightTo) {
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
    }


    public String getFlightFrom() {
        return flightFrom;
    }

    public String getFlightTo() {
        return flightTo;
    }


    @Override
    public String toString() {
        return "flightFrom ='" + flightFrom + '\'' +
                ", flightTo ='" + flightTo + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (flightFrom != null ? !flightFrom.equals(flight.flightFrom) : flight.flightFrom != null) return false;
        return flightTo != null ? flightTo.equals(flight.flightTo) : flight.flightTo == null;
    }

    @Override
    public int hashCode() {
        int result = flightFrom != null ? flightFrom.hashCode() : 0;
        result = 31 * result + (flightTo != null ? flightTo.hashCode() : 0);
        return result;
    }
}