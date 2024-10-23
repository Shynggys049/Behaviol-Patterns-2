class PriceContext {
    private PricingStrategy strategy;

    public void setStrategy(PricingStrategy strategy) {
        this.strategy = strategy;
    }

    public double executeStrategy(double value) {
        return strategy.calculatePrice(value);
    }
}