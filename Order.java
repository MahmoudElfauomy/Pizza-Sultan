import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int orderId = 0;
    private int curOrder;
    private Status status;
    private List<ITEM> items = new ArrayList<>();
    private int subtotal = 0;
    private double discounts = 0;

    public Order() {
        this.curOrder = ++orderId;
        status = Status.NEW;
    }

    public void addItem(ITEM it, int quantity) {
        subtotal += it.Price() * quantity;
        items.add(it);
    }

    void checkDiscoutn() {
        discounts += new Discount().clc1(subtotal);
        discounts += new Discount().clc2(subtotal, items);
    }

    int getSubtotal() {
        return subtotal;
    }

    int getOrderId() {
        return orderId;
    }

    int getDiscounts() {
        double ret = discounts * subtotal;
        return (int) ret;
    }

}
