package JavaExamples.Collections12;
import java.util.HashMap;
import  java.util.Map;

public class Employee {
    public static void main(String[] args) {
        HashMap<String,Integer> animal= new HashMap<>();
        animal.put("sreeja",22);
        animal.put("varun",12);
        animal.put("kennal",23);
        animal.put("teja",34);
        System.out.println("animal in the list names : " + animal);
        int id=23;
        if (animal.containsKey(id)) {

        
            System.out.println("Employee id with name is: " + animal.get(id));
        } else {
            System.out.println("employee id is not found in the list" +  id);
        }
    }
      
    
    
}








        


    
    

