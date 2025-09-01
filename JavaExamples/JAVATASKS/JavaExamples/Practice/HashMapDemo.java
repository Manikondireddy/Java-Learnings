package JavaExamples.Practice;

import java.util.HashMap;

public class HashMapDemo { 
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"man");
        map.put(2, "women");
        map.put(3,"gender");
        System.out.println(map.get(2));
    }
    
}
