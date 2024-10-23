abstract class OrderProcess {

    // Template method
    public final void processOrder() {
        checkAvailability();
        calculateCost();
        confirmOrder();
    }

    protected abstract void checkAvailability();
    protected abstract void calculateCost();
    protected abstract void confirmOrder();
}