class FinishedState implements OrderState {
    @Override
    public void next(OrderContext context) {
        System.out.println("Order already completed.");
    }

    @Override
    public void prev(OrderContext context) {
        context.setState(new OnTheWayState());
    }

    @Override
    public String getStatus() {
        return "Order Finished";
    }
}