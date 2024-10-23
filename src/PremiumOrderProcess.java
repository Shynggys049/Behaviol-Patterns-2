class PremiumOrderProcess extends OrderProcess {
    @Override
    protected void checkAvailability() {
        System.out.println("Checking premium taxi availability...");
    }

    @Override
    protected void calculateCost() {
        System.out.println("Calculating cost for premium services...");
    }

    @Override
    protected void confirmOrder() {
        System.out.println("Premium order confirmed.");
    }
}