package tests;

import container.IContainer;
import container.PaperCup;
import flavors.IFlavor;
import order.Order;
import org.junit.jupiter.api.Test;
import toppings.IToppings;

import java.util.HashMap;
import java.util.Map;

public class OrderCreatorTest {
    @Test
    public void testOrderCreator() {
        Map<IFlavor,Integer> flavorChoiceAndAmount = new HashMap<IFlavor,Integer>();
        Map<IToppings,Integer> toppingChoiceAndAmount = new HashMap<>();
        IContainer container = new PaperCup();
        

    }
}
