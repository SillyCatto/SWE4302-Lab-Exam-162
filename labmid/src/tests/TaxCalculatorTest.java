package tests;

import org.junit.jupiter.api.Test;
import tax.DefaultTaxCalculator;

public class TaxCalculatorTest {
    @Test
    public void testDefaultTaxCalculator() {
        DefaultTaxCalculator taxCalculator = new DefaultTaxCalculator();
        asserEquals(8, taxCalculator.getTax(100));
    }
}
