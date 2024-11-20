package invoice;

import order.Order;

public interface IInvoiceMaker {
    void generateInvoice(Order order);
}
