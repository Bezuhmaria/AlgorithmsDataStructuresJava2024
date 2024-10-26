package HashMaptask3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        List<String> dishes1 = new ArrayList<>();
        dishes1.add("Steak");
        dishes1.add("Salad");

        List<String> dishes2 = new ArrayList<>();
        dishes2.add("Borscht");
        dishes2.add("Soup");

        restaurant.addOrder(1, "First Customer", dishes1);
        restaurant.addOrder(2, "Second Customer", dishes2);

        restaurant.displayOrders();

        Order order = restaurant.getOrder(1);
        if (order != null) {
            System.out.println(order);
            System.out.println("------\n");
        } else {
            System.out.println("Order not found.");
        }

        restaurant.removeOrder(1);

        restaurant.displayOrders();
    }
}
