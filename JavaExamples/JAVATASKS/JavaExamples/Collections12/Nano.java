package JavaExamples.Collections12;
import java.util.HashMap;
import java.util.Map;

public class Nano {
     public static void main(String[] args) {
     Map<String, Integer> students = new HashMap<>();
        students.put("Alice", 90);
        students.put("Bob", 75);
        students.put("Charlie", 85);
        students.put("David", 60);
        students.put("Eve", 95);

        System.out.println("Students with marks greater than 80:");
      for(Map.Entry<String,Integer> entry :students.entrySet())
            {
                if(entry.getValue() > 80)
                {
                    System.out.println(entry.getKey()+ "----" +entry.getValue());
                }
                 }
                }

            }
        