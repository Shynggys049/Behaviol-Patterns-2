class OnTheWayState implements OrderState {
    @Override
    public void next(OrderContext context) {
        context.setState(new FinishedState());
    }

    @Override
    public void prev(OrderContext context) {
        context.setState(new ConfirmedState());
    }

    @Override
    public String getStatus() {
        return "Taxi On The Way";
    }
}