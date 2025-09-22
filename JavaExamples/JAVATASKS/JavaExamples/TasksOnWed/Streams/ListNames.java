package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListNames {
    public static void main(String[] args) {
        List<String> jam= Arrays.asList("varun","tharun","krishna","radha","madhu","suhas","kurshal");
        List<String>raj=jam.stream()
                        .filter(n->n.startsWith("r") )
                        .map(String::toUpperCase)
                        .sorted()
                        .collect(Collectors.toList());
                        System.out.println("final list in order :" + raj);
    }
    
}
