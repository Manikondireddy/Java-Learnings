package JavaExamples.Collections12;

import java.util.TreeMap;
import java.util.Map;

public class Students {
    public static void main(String[] args) {
        TreeMap<String,Integer> map = new TreeMap<>();
        map.put("mango", 6);
        map.put("bannana", 7);
        map.put("grapes",3);
        map.put("orange", 4);
    System.out.println("tree list " + map);
    System.out.println("Getting the element : " + map.get("orange"));
    map.remove("orange");
    System.out.println("After removing :" + map);
    System.out.println("first key : " + map.firstKey());
    System.out.println(("last key : " +map.lastKey()));
    System.out.println("iterating tree map (sortrd my map length) :");
    for(Map.Entry<String,Integer> entry :map.entrySet())
    {
        System.out.println(entry.getKey() + "->" +entry.getValue());
        
    }







        
    }

    
}
