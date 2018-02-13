package com.kodilla.good.patterns.challanges.flight;

import java.util.List;
import java.util.Set;

public interface CustomerService {
    public void updateAirports(Set<Airport> airports);
    public InfoRequest nextInfoRequest();
    public boolean hasNextInfoRequest();
    public void replyToInfoRequest(InfoRequest request, List<TravelPlan> tplist);
    public void sendError(InfoRequest request);
}
