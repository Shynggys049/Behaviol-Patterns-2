class OrderContext {
    private OrderState state;

    public OrderContext() {
        state = new CreatedState();  // Initial state
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public OrderState getState() {
        return state;
    }

    public void nextState() {
        state.next(this);
    }

    public void previousState() {
        state.prev(this);
    }

    public String getStatus() {
        return state.getStatus();
    }
}