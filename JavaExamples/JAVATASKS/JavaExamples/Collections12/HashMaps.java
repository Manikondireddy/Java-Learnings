package JavaExamples.Collections12;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import JavaExamples.Linked;


public class HashMaps {
    public static void main(String[] args) {
        HashMap<String,String> map =  new HashMap<>();
        map.put("202","Mani");
        map.put("202","man");
        map.put("203","angel");
        map.put("204","devil");
        System.out.println("map content :");
        for(Map.Entry<String,String> entry:map.entrySet())
        {
            System.out.println("key = " + entry.getKey());
            System.out.println("value =" + entry.getValue());
        }
    }
}




 

    



    
