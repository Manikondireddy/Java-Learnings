package JavaExamples.TasksOnWed;
import java.util.HashMap;
 import java.util.Map;
public class Employee {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();
        employees.put(101, "Naga");
        employees.put(102, "priya");
        employees.put(103, "Sreeja");
        employees.put(104, "pandu");
        int id=103;
        if(employees.containsKey(id))
        {
            System.out.println("Employee id with name is  :" + employees.get(id) );
        }
         else{
        System.out.println("employee id is not found ");
        }
        } 
    }
    

      
        
    

