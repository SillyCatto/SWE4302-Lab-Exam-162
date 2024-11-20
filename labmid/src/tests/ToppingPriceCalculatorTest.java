package tests;

import flavors.ChocolateFudge;
import flavors.MintChocolateChip;
import org.junit.jupiter.api.Test;
import toppings.ChocolateChip;
import toppings.Sprinkles;

public class ToppingPriceCalculatorTest {
    @Test
    public void testSprinklesPrice() {
        Sprinkles sprinkles = new Sprinkles();
        asserEquals(0.3, sprinkles.getPrice());
    }

    @Test
    public void testChocolateChipPrice() {
        ChocolateChip chip = new ChocolateChip();
        asserEquals(0.5, chip.getPrice());
    }
}
