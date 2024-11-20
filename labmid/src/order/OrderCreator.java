package order;

import container.IContainer;
import flavors.IFlavor;
import toppings.IToppings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OrderCreator {
    Map<IFlavor,Integer> flavorChoiceAndAmount;
    Map<IToppings,Integer> toppingChoiceAndAmount;
    IContainer container;

    public OrderCreator(){
        flavorChoiceAndAmount = new HashMap<>();
        toppingChoiceAndAmount = new HashMap<>();
    }

    public void promptUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the flavors you wish to order: ");
        System.out.println("1. Chocolate Fudge");
        System.out.println("2. Mint Chocolate Chip");
        // more options...
        // build map from user choice and amount
    }

    public Order createOrder(){
        Order order = new Order();
        order.buildOrder(flavorChoiceAndAmount,
                toppingChoiceAndAmount,
                container);
        return order;
    }
}