class StandardOrderProcess extends OrderProcess {
    @Override
    protected void checkAvailability() {
        System.out.println("Checking taxi availability for standard order...");
    }

    @Override
    protected void calculateCost() {
        System.out.println("Calculating cost based on distance for standard order...");
    }

    @Override
    protected void confirmOrder() {
        System.out.println("Standard order confirmed.");
    }
}