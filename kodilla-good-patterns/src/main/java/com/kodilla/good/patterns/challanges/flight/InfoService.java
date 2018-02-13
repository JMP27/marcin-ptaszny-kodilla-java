package com.kodilla.good.patterns.challanges.flight;

import java.util.*;

public interface InfoService {
    public Set<Airport> getAirports();
    public List<TravelPlan> getTravelPlans(InfoRequest request);
}
