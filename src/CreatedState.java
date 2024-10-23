class CreatedState implements OrderState {
    @Override
    public void next(OrderContext context) {
        context.setState(new ConfirmedState());
    }

    @Override
    public void prev(OrderContext context) {
        System.out.println("This is the initial state, can't go back.");
    }

    @Override
    public String getStatus() {
        return "Order Created";
    }
}
