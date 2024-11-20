package order;

import java.util.ArrayList;

public class OrderManager {
    ArrayList<Order> orders;
    OrderCreator orderCreator;
    public OrderManager() {
        orderCreator = new OrderCreator();
        orders = new ArrayList<>();
    }

    public void getOrder() {
        orderCreator.promptUser();
        Order order = orderCreator.createOrder();
        orders.add(order);
    }

    public void generateOrderInvoice() {

    }
}
