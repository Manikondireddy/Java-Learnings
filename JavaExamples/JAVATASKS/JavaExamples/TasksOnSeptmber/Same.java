package JavaExamples.TasksOnSeptmber;
import java.util.HashMap;
import java.util.Map;
public class Same {
    public static void main(String[] args) {
        Map<String, Integer> studentMarks = new HashMap<>();
        studentMarks.put("Mani", 95);
        studentMarks.put("Mini", 72);
        studentMarks.put("Many", 88);
        studentMarks.put("Moni", 60);
        studentMarks.put("Mahi", 92);

        System.out.println("Students with marks > 80:");
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            if (entry.getValue() > 80) {
                System.out.println(entry.getKey() + " ->" + entry.getValue());
            }
        }
    }
}
