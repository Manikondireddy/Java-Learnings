package JavaExamples.Practice;

import java.util.HashMap;

public class MapExample { 
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        System.out.println(map);
        System.out.println("Key 2 = " + map.get(2));
    }
}
    

