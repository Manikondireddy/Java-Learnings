package JavaExamples.Wednesday;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Ani2 {
    public static void main(String[] args) {
        HashMap<Integer,String> map= new LinkedHashMap<>();
        map.put(2, "mani");
        map.put(9, "mahi");
        map.put(3,"deva " );
        map.put(2, "varun");
        map.put(22, "mini");
    System.out.println(" student in the list :" + map);

    for(String value:map.values())
    {
        System.out.println(value);
    }
    }


     
}
