package JavaExamples;
import java.util.LinkedHashSet;
public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Grape");
        System.out.println("LinkedHashSet: " + fruits); 
        System.out.println("Contains 'Banana': " + fruits.contains("Banana"));
        fruits.remove("Orange");
        System.out.println("After removing 'Orange': " + fruits);
    }
}
    

