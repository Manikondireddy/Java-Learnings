package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Removedup {
    public static void main(String[] args) {
        List<Integer> dupl=Arrays.asList(22,3,4,5,77,2,8,99,56,34,3,99,67,44,4);
        List<Integer>duplicate =dupl.stream()
                               .distinct()
                               .collect(Collectors.toList());
                               System.err.println("original list :" + dupl);
                               System.err.println("duplicate :" + duplicate);
    }
    
}
