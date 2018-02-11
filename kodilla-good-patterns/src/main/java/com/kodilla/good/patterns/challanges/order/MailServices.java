package com.kodilla.good.patterns.challanges.order;

class MailService implements InformationService {
    @Override
    public boolean inform(Order order) {
        User user = order.getUser();
        String email = user.getEmail();

        // return send(email, prepareTitle(...), prepareMessage(...);
        // dummy result:
        return true;
    }
}
