package JavaExamples;
import java.util.HashMap;
import java.util.Map;

import com.sun.jdi.Value;


public class Employee {
    public static void main(String[] args) {
        HashMap<String,Integer> m= new HashMap<>();
        m.put("Mani",12);
        m.put("mini",23 );
        m.put("renu", 34);
        m.put("raghu",45);
        int id=12;
        System.out.println("All in  the list m :" + m);
        if(m.containsKey(id))
        {
            // String mname=m.get("id");
             int mName = m.get("mani");
           System.out.println("mID: " + id + " → Name: " + mName);
        }
        else{
            System.out.println("employee name is not found :");
        }
        }

    }

        

  

