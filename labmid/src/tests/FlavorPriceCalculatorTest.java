package tests;

import flavors.ChocolateFudge;
import flavors.MintChocolateChip;
import org.junit.jupiter.api.Test;

public class FlavorPriceCalculatorTest {
    @Test
    public void testChocolateFudgePrice() {
        ChocolateFudge fudge = new ChocolateFudge();
        asserEquals(3.00, fudge.getPricePerScoop());
    }

    @Test
    public void testMintChocolateChipPrice() {
        MintChocolateChip fudge = new MintChocolateChip();
        asserEquals(3.00, fudge.getPricePerScoop());
    }

    
}
