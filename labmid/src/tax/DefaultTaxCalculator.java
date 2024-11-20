package tax;

public class DefaultTaxCalculator implements ITax {
    @Override
    public double getTax(double basePrice) {
        double defaultTax = 0.8;
        return defaultTax * basePrice;
    }
}
