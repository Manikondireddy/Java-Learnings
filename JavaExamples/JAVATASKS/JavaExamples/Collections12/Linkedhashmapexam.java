package JavaExamples.Collections12;
import java.util.*;

public class Linkedhashmapexam {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> student = new LinkedHashMap<>();

        student.put("ravi", 201);
        student.put("rani",23);
        student.put("mahi",22);
        student.put("mahi",56);
        student.put("raju",12);
        System.out.println("Student list :" + student);
        System.out.println("acess the list  :" + student.get("mahi"));
        student.remove("raju");
        System.out.println("After removing :" + student);
        for(Map.Entry<String,Integer> entry:student.entrySet())
        {
            System.out.println((entry.getKey() +"-->" + entry.getValue()));
        }


        
    }
    
}
