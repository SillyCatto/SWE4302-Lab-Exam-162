package tax;

public class DefaultTaxCalculator implements ITax {
    double defaultTax;
    @Override
    public double getTax(double basePrice) {
        return defaultTax * basePrice;
    }
}
