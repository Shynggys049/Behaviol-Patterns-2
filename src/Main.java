public class Main {
    public static void main(String[] args) {

        Order order = new Order();
        Client client1 = new Client("Alice");
        Client client2 = new Client("Bob");

        order.attach(client1);
        order.attach(client2);

        order.setStatus("Confirmed");


        OrderContext context = new OrderContext();
        System.out.println(context.getStatus());

        context.nextState();
        System.out.println(context.getStatus());

        context.nextState();
        System.out.println(context.getStatus());


        PriceContext priceContext = new PriceContext();
        priceContext.setStrategy(new DistancePricingStrategy());
        System.out.println("Distance-based pricing: " + priceContext.executeStrategy(10));

        priceContext.setStrategy(new TimePricingStrategy());
        System.out.println("Time-based pricing: " + priceContext.executeStrategy(20));


        OrderProcess standardProcess = new StandardOrderProcess();
        standardProcess.processOrder();

        OrderProcess premiumProcess = new PremiumOrderProcess();
        premiumProcess.processOrder();
    }
}
