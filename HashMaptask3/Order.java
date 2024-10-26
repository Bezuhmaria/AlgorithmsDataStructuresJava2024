package HashMaptask3;

import java.util.List;

public class Order {
    final private int orderNumber;
    final private String customerName;
    final private List<String> dishes;

    public Order(int orderNumber, String customerName, List<String> dishes) {
        this.orderNumber = orderNumber;
        this.customerName = customerName;
        this.dishes = dishes;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<String> getDishes() {
        return dishes;
    }

    @Override
    public String toString() {
        return "Order Number: " + orderNumber +
               "\nCustomer Name: " + customerName +
               "\nDishes: " + dishes;
    }
}

