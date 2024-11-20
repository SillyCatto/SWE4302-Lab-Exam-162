package toppings;

import container.IContainer;
import container.PaperCup;
import flavors.IFlavor;
import order.Order;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class OrderTest {
    @Test
    public void testOrderBuilder() {
        Map<IFlavor,Integer> flavorChoiceAndAmount = new HashMap<IFlavor,Integer>();
        Map<IToppings,Integer> toppingChoiceAndAmount = new HashMap<>();
        IContainer container = new PaperCup();

        Order order = new Order();
        order.buildOrder(flavorChoiceAndAmount, toppingChoiceAndAmount, container);
        assertEquals(order.getFlavorChoiceAndAmount(), flavorChoiceAndAmount);
        assertEquals(order.getToppingChoiceAndAmount(), toppingChoiceAndAmount);
        assertEquals(order.getContainer(), container);
    }
}
