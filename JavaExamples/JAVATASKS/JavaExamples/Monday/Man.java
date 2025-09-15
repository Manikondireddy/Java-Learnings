package JavaExamples.Monday;
import java.util.HashMap;
import java.util.Map;

public class Man {
    public static void main(String[] args) {
        HashMap<String,String> hash= new HashMap<>();
         hash.put("Dora", "11");
         hash.put("den","44");
         hash.put("Buji", "23");
         hash.put("denman","24");
         hash.put("mani","45");
         hash.put("medha", "67");
         hash.put("mahi","12");
         hash.put("pen","45");
         hash.put("renu","6");
         hash.put("mini","62");
         System.out.println("All values in the hashMAP ");
        for(String value : hash.values())
        //  for(String value:map.values())
         {
            System.out.println(value);
         }
        }
    }
    

    
    

