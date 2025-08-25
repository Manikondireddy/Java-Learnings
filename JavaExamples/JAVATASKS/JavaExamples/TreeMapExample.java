package JavaExamples;
    import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

       
        map.put(3, "Mango");
        map.put(1, "Apple");
        map.put(2, "Banana");

        System.out.println("TreeMap: " + map);
        System.out.println("Value for key 2: " + map.get(2));
       map.remove(1);
        System.out.println("After removing key 1: " + map);
    }
}

    

