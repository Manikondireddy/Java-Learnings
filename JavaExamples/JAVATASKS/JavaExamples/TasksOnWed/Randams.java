package JavaExamples.TasksOnWed;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Randams {
    public static void main(String[] args) 
    {
        HashMap<String,Integer>map = new HashMap<>();
        map.put("Mahi",22);
        map.put("mani",33);
        map.put("rani",66);
        map.put("krishna",1);
        map.put("varun",22);
        map.put("sudha",45);
        map.put("teja",43);
        map.put("sree",12);
        map.put("krish",35);
        map.put("deva",11);
        System.out.println("Number of students in the list :" );
        for(Map.Entry<String,Integer>entry :map.entrySet() )
        {
            System.out.println (entry.getValue());

        }


        {
            
        }
        
    }

    
}
