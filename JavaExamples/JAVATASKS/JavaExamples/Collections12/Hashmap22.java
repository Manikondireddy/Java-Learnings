package JavaExamples.Collections12;
import java.util.HashMap;
import java.util.Map;

import JavaExamples.Student;

public class Hashmap22 {
    public static void main(String[] args) {
        HashMap<String,String> student = new HashMap<>();
        student.put("dolly", "12");
        student.put("rani", "4");
        student.put("don","34");
        student.put("ran","22");
        System.out.println("student details about the data :" );
         for(Map.Entry<String,String> entry : 
         
         map.entryset())
        //  for(Map.Entry<String,String> entry:Student.entryset())
        {
            System.out.println("key =" + entry.getKey());
            System.out.println("value =" + entry.getValue());

        }

        
    }
    
}
