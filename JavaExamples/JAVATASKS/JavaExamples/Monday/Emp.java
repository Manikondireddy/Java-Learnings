package JavaExamples.Monday;
import java.util.HashMap;

public class Emp {
    public static void main(String[] args)
    {
        HashMap<String,Integer> employees= new HashMap<>();
        employees.put("Madhu", 123);
        employees.put("renu",12);
        employees.put("mad",23);
        employees.put("renu",34);
        System.out.println("Employees :" + employees);
         
Integer name=employees.get("12");
System.out.println("employees with id 12 is:"+ name);

        // System.out.println(employees);

        // // Fetch employee name by ID
        // String name = employees.get(103);  // directly fetch ID 103
        // System.out.println("Employee with ID 103: " + name);
    }
    
}
