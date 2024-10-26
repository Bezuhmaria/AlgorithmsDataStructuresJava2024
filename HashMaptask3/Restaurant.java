package HashMaptask3;

import java.util.HashMap;
import java.util.List;

public class Restaurant {
    final private HashMap<Integer, Order> orders;

    public Restaurant() {
        this.orders = new HashMap<>();
    }

    public void addOrder(int orderNumber, String customerName, List<String> dishes) {
        Order newOrder = new Order(orderNumber, customerName, dishes);
        orders.put(orderNumber, newOrder);
    }

    public void removeOrder(int orderNumber) {
        orders.remove(orderNumber);
    }

    public Order getOrder(int orderNumber) {
        return orders.get(orderNumber);
    }

    public void displayOrders() {
        if (orders.isEmpty()) {
            System.out.println("No orders found.");
        } else {
            for (Order order : orders.values()) {
                System.out.println(order);
            }
            System.out.println("------");
        }
    }
}
