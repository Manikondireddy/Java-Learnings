package JavaExamples.Wednesday.THURSDAy;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Fruits {
    public static void main(String[] args) {
        HashMap<String,String> map= new LinkedHashMap<>();
        map.put("11","Mango");
        map.put("22", "bananna");
        map.put("9", "guava");
        map.put("5","avocoda");
        map.put("5", "apple");
        map.put("3", "pineapple");
        map.put("5", "orange");
        map.put("6","papaya");
        map.put("221", "grapes");
        map.put("0", "dryfruit");
        for(String value:map.values())
        {
            System.out.println(value);
        }
    }
    
}
