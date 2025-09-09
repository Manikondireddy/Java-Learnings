package JavaExamples.Collections12;
import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class HashMapKey {
    public static void main(String[] args) {
        HashMap<String,String> map= new HashMap<>();
        map.put("101","Mani");
        map.put("102","mini");
        map.put("103","mouni");
        map.put("104","Madhu");
        map.put("105","mahi");
        System.err.println("Hahmap content");
        for(Map.Entry<String,String> entry:map.entrySet())
        {
            System.out.println("key =" + entry.getKey());
            System.out.println("value =" + entry.getValue());
        }
        
    
}
}
