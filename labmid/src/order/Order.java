package order;

import container.IContainer;
import flavors.IFlavor;
import toppings.IToppings;

import java.util.Map;

public class Order {
    Map<IFlavor,Integer> flavorChoiceAndAmount;
    Map<IToppings,Integer> toppingChoiceAndAmount;
    IContainer container;

    public void buildOrder(
            Map<IFlavor,Integer> flavorChoiceAndAmount,
            Map<IToppings,Integer> toppingChoiceAndAmount,
            IContainer container) {

    }

    public Map<IFlavor,Integer> getFlavorChoiceAndAmount() {}
    public Map<IToppings,Integer> getToppingChoiceAndAmount() {}
    public IContainer getContainer() {}

    public double getTotalPrice() {
        // return total price
    }
}
