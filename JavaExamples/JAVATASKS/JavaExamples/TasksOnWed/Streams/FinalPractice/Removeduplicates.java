package JavaExamples.TasksOnWed.Streams.FinalPractice;
    import java.util.*;
import java.util.stream.*;

public class Removeduplicates {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mani", "mini", "mahi", "mini", "mani", "madhu");
        List<String> uniqueNames = names.stream()
                                        .distinct()  
                                        .collect(Collectors.toList());

        System.out.println("Original List: " + names);
        System.out.println("Without Duplicates: " + uniqueNames);
    }
}
    

