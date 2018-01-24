package com.kodilla.exception.test;

import javax.management.relation.RoleNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class FlightConnection {
    public Boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String,Boolean> possibleAirPort = new HashMap<String,Boolean>();
        possibleAirPort.put("Katowice" , true);
        possibleAirPort.put("Warsaw", false);

        Boolean isPossible = possibleAirPort.get(flight.getDepartureAirport());

        if (isPossible == null){
            throw new RouteNotFoundException("Not found your destinations Air Port");
        }

        return isPossible;
    }
}
