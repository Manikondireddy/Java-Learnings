package JavaExamples.Collections12;

import java.util.Map;
import java.util.HashMap;

public class Hash224 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Rani", 10);
        map.put("mahi", 76);
        map.put("sree",61);
        System.out.println("employee list :" + map);
        int id= 76;
        if(map.containsKey("id")){
        System.err.println("fetching the employee id : " + map.get(id));
    }

    else
        {
            System.out.println("after fetching id : " + map);

        
        }
    }
}


    

