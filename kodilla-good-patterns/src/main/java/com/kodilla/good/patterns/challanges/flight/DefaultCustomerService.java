package com.kodilla.good.patterns.challanges.flight;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static com.kodilla.good.patterns.challanges.flight.Airport.*;
import static com.kodilla.good.patterns.challanges.flight.ConnectType.*;
import static java.time.LocalDate.now;

public class DefaultCustomerService implements CustomerService {
    private static final List<InfoRequest> requests = new ArrayList<>();
    static {
        requests.add(new InfoRequest(DIRECT_FROM, EPGD, null, null, now()));
        requests.add(new InfoRequest(DIRECT_TO, null, EPKK, null, now()));
        requests.add(new InfoRequest(DIRECT_FROM_TO, EPGD, EPKK, null, now()));
        requests.add(new InfoRequest(DIRECT_OR_INDIRECT_FROM_TO, EPGD, EPKK, null, now()));
        requests.add(new InfoRequest(INDIRECT_FROM_TO_VIA, EPGD, EPKK, EPWA, now()));
        requests.add(new InfoRequest(INDIRECT_FROM_TO_VIA, EPGD, EPKK, EPPO, now()));
        requests.add(new InfoRequest(DIRECT_FROM_TO, EPWR, EPKK, null, now()));
        requests.add(new InfoRequest(INDIRECT_FROM_TO_VIA, EPWR, EPKK, EPWA, now()));
        requests.add(new InfoRequest(INDIRECT_FROM_TO_VIA, EPWR, EPKK, EPGD, now()));
    }

    private Iterator<InfoRequest> it = requests.iterator();

    @Override
    public void updateAirports(Set<Airport> airports) {
        if (airports == null) {
            throw new IllegalStateException("null airports set");
        }
        System.out.println("Updating of airports information");
        airports.stream()
                .map(Airport::toFineString)
                .forEach(System.out::println);
        System.out.println("done.\n");
    }

    @Override
    public InfoRequest nextInfoRequest() {
        return it.next();
    }

    @Override
    public boolean hasNextInfoRequest() {
        return it.hasNext();
    }

    @Override
    public void replyToInfoRequest(InfoRequest request, List<TravelPlan> tplist) {
        System.out.println("Replaying for request " + request);
        if(tplist.isEmpty()) {
            System.out.println("There are not any flights fulfilling Your request");
        }
        tplist.stream()
                .map(tp -> tp.toFineString() + "\n")
                .forEach(System.out::println);
    }

    @Override
    public void sendError(InfoRequest request) {
        System.out.println("Sending an error message to customer");
    }
}
