import java.util.ArrayList;
import java.util.HashSet;

class PizzaOrder {
    String name;
    String size;

    PizzaOrder(String name, String size) {
        this.name = name;
        this.size = size;
    }
    public String toString() {
        return name + " (" + size + ")";
    }
}
public class UniquePizzaOrders {
    public static void main(String[] args) {
        ArrayList<PizzaOrder> orders = new ArrayList<>();
        orders.add(new PizzaOrder("Mar", "Medium"));
        orders.add(new PizzaOrder("Pep", "Large"));
        orders.add(new PizzaOrder("Marg", "Small")); 
        orders.add(new PizzaOrder("Veg", "Medium"));
        ArrayList<PizzaOrder> uniqueOrders = new ArrayList<>();
        HashSet<String> seenNames = new HashSet<>();

        for (PizzaOrder order : orders) {
            if (seenNames.contains(order.name)) {
                uniqueOrders.add(order);
                seenNames.add(order.name);
            }
        }
        System.out.println("Unique Pizza Orders:");
        for (PizzaOrder order : uniqueOrders) {
            System.out.println(order);
        }
    }
}
    
    

