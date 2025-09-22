package JavaExamples.TasksOnWed.Streams;

import java.util.HashMap;
import java.util.Map;

public class MapStream {
    public static void main(String[] args) {
        Map<Integer,String> students = new HashMap<>();
        students.put(1, "raju");
        students.put(2,"rani");
        students.put(3,"king");
        students.put(4,"queen");
        students.put(5,"theif");
        System.out.println("\nkeys");
        students.keySet().stream().forEach(System.out::println);
        System.out.println("\nvalues");
        students.values().stream().forEach(System.out::println);
        System.out.println("\nEntries");
        students.entrySet().stream().forEach(entry ->System.out.println(entry.getKey() + "---->" + entry.getKey()));
    }
        
    
}
