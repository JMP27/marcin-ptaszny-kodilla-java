package com.kodilla.good.patterns.challanges.flight;

import java.util.List;

public class Applications {

    public static void main(String[] args) {
        DefaultInfoService is = new DefaultInfoService(new DefaultFlightsDatabase());
        CustomerService cs = new DefaultCustomerService();

        // CustomerService uses airports list as parameters during request creation by customer.
        cs.updateAirports(is.getAirports());

        while(cs.hasNextInfoRequest()) {
            InfoRequest request = cs.nextInfoRequest();
            List<TravelPlan> tplist = null;
            try {
                tplist = is.getTravelPlans(request);
                cs.replyToInfoRequest(request, tplist);
            } catch (Exception ex) {
                if (tplist == null) {
                    cs.sendError(request);
                }
                throw ex;
            }
        }
    }
}
