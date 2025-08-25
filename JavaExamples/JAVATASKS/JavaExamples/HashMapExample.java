package JavaExamples;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");
        map.put(2, "Grapes"); 
        System.out.println("HashMap: " + map);
        System.out.println("Value for key 1: " + map.get(1));
        map.remove(3);
        System.out.println("After removing key 3: " + map);
    }
}

    

