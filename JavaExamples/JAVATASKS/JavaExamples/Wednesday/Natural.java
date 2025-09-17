package JavaExamples.Wednesday;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Natural {
    public static void main(String[] args) {
        HashMap<String,String> map= new LinkedHashMap<>();
        map.put("goat","22");
        map.put("sheep","2") ;
        map.put("zebra", "10");
        map.put("pig", "5");
        map.put("rabbit", "7");
        map.put("linon","4");
        map.put("tiger", "1");
        map.put("aeroplane", "0");
        map.put("hen", "6");
        map.put("peacock", "23");
//         for(String value:map.values())
//         {
// System.out.println(value);
//         }

for(Map.Entry<String, String>entry :map.entrySet() )
{
    System.out.println(entry.getKey() + "--->" + entry.getValue());
}
         
        
        }
        

    }
    

