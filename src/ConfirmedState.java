class ConfirmedState implements OrderState {
    @Override
    public void next(OrderContext context) {
        context.setState(new OnTheWayState());
    }

    @Override
    public void prev(OrderContext context) {
        context.setState(new CreatedState());
    }

    @Override
    public String getStatus() {
        return "Order Confirmed";
    }
}
