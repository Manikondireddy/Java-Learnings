package JavaExamples.JAVATASKS;
import java.util.ArrayList;
import java.util.List;
public class ArrayList1 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple");

        System.out.println("Fruits in the list: " + fruits);
        System.out.println("First fruit: " + fruits.get(0));
        fruits.remove("Banana");
        System.out.println("Fruits after removing Banana: " + fruits);
        System.out.println("Iterating through fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}



