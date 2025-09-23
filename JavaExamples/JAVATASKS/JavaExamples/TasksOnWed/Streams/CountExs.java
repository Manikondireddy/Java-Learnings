package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;

public class CountExs {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(10,29,3,49,44,89);
        long count=numbers.stream()
                       .filter(n->n >10)
                      .count();
System.out.println("cont the greaterthan element :" + count);
        
    }
    
}
