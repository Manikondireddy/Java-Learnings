package JavaExamples.Collections12;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashM {
    public static void main(String[] args) 
    {
        LinkedHashMap<String,String> map = new LinkedHashMap<>();
        for(int i=1;i<10;i++)
        {
            map.put("key" +i,"value" +i);
        }
        for(String value:map.values())
        {
            System.out.println(value);
        }

    }

    

