class TimePricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double time) {
        return time * 0.75;  // Price per minute
    }
}