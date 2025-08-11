package JavaExamples.JAVATASKS;
 import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        Map<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Mani", 95);
        studentGrades.put("Mahi", 88);
        studentGrades.put("Madhu", 92);
        studentGrades.put("Mouni", 98);

        System.out.println("Student grades: " + studentGrades);
        System.out.println("Grade of Mani: " + studentGrades.get("Mani"));
        System.out.println("Contains Madhu " + studentGrades.containsKey("Madhu"));
        System.out.println("Iterating through grades:");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
