package JavaExamples.TUESDAY;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Stri {
    public static void main(String[] args) {
        HashMap<String,String> map= new LinkedHashMap<>();
        map.put("mango","12");
        map.put("bananna","22");
        map.put("apple","32" );
        map.put("grapes","21" );
        map.put("orange","2");
        map.put("avocoda","1");
        map.put("guava","56");
        map.put("papya","6");
        map.put("berry","34");
        map.put("pineapple","23");

        for(String Value:map.values())
        {
            System.out.println(Value);
        }
    }
    
}
  