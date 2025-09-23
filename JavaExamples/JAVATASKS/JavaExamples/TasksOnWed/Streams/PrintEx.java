package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;

public class PrintEx {
    public static void main(String[] args) {
        List<Integer> num=Arrays.asList(12,34,54,67);
        num.stream()
        .forEach(System.out::println);
    }
    
}
