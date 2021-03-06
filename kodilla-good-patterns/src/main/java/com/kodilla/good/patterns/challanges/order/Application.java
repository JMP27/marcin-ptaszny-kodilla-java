package com.kodilla.good.patterns.challanges.order;

public class Application {
    public static void main(String[] args) {
        User user = new User(1, "Mar", "Pta", "NY Streat",
                "mar.pta@gmail.com");
        Product product = new Product(1, "Gra Diablo",
                630);

        OrderRequestRetriever orr = new OrderRequestRetriever();
        OrderRequest request = orr.retrieve(user, product);

        OrderProcessor processor = new OrderProcessor(new MailService(),
                new SimpleOrderService(), new InMemoryOrderRepository());

        OrderProcessResult result = processor.process(request);

        if (result == null) {
            printError("Order process failed for request: " + request);
            return;
        }
        printInfo("Created order: " + result.getOrder());
        if (!result.isUserInformed()) {
            printWarning("Information service failed. "
                    + "User should be informed in another way!");
        }
        if (!result.isOrderStored()) {
            printWarning("Order storage in repository failed. "
                    + "Services based on repository may work incorrectly!");
        }
    }

    private static void printError(String message) {
        System.out.println("ERROR: " + message);
    }

    private static void printInfo(String message) {
        System.out.println("INFO: " + message);
    }

    private static void printWarning(String message) {
        System.out.println("WARNING: " + message);
    }
}