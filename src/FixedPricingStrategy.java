class FixedPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double fixedRate) {
        return fixedRate;  // Fixed price
    }
}