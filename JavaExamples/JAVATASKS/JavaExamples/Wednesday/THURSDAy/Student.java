package JavaExamples.Wednesday.THURSDAy;
import java.util.HashMap;
import java.util.Map;

public class Student {
    public static void main(String[] args) {
        
        Map<Integer,String> map= new HashMap<>();
        map.put(80,"madhu");
        map.put(92, "mahi");
        map.put(90, "krishna");
        map.put(23, "mani");
        map.put(96, "megha");
        System.err.println("student list :" + map);
        for(Map.Entry<Integer,String> entry :map.entrySet())
        {
            if(entry.getKey()>80)
            {

            
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        

            
        
    }
    
}
    }
}
